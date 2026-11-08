# ABC483C

import sys

def solve():
    it = map(int, sys.stdin.read().split())
    N, M = next(it), next(it)
    A = [0] * M
    groups = [[] for _ in range(N)]
    votes = [0] * N
    for i in range(M):
        a, b = next(it) - 1, next(it) - 1
        A[i] = a
        groups[a].append(b)
        votes[a] += 1

    size = 1
    while size < N:
        size *= 2

    INF = 10**18
    seg = [(-INF, -INF)] * (2 * size)

    for i in range(N):
        seg[size + i] = (votes[i], -i)

    for i in range(size - 1, 0, -1):
        seg[i] = max(seg[2 * i], seg[2 * i + 1])

    def update(pos, value):
        pos += size
        seg[pos] = (value, -pos + size)
        pos //= 2

        while pos:
            seg[pos] = max(seg[2 * pos], seg[2 * pos + 1])
            pos //= 2

    answer = []

    for k in range(N):
        update(k, -INF)

        for b in groups[k]:
            votes[b] += 1
            update(b, votes[b])

        winner = -seg[1][1]
        answer.append(winner + 1)

        for b in groups[k]:
            votes[b] -= 1
            update(b, votes[b])

        update(k, votes[k])

    print("\n".join(map(str, answer)))


if __name__ == "__main__":
    solve()

