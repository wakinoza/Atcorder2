# 鉄則問題集A64（ダイクストラ法）
import sys
import heapq

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, m = next(it), next(it)
    graf = [[] for i in range(n + 1)]
    for _ in range(m):
        a, b, c = next(it), next(it), next(it)
        graf[a].append((b, c))
        graf[b].append((a, c))

    confirmed = [False] * (n + 1)
    current = [float('inf')] * (n + 1)
    q = []

    current[1] = 0
    heapq.heappush(q, (current[1], 1))

    while len(q) > 0 :
        d, pos = heapq.heappop(q)
        if confirmed[pos]:
            continue
        confirmed[pos] = True
        for i in range(len(graf[pos])):
            nex = graf[pos][i][0]
            dist = graf[pos][i][1]
            if current[nex] > current[pos] + dist:
                current[nex] = current[pos] + dist
                heapq.heappush(q, (current[nex], nex))

    for i in range(1, n + 1):
        if current[i] == float('inf'):
            print(-1)
        else:
            print(current[i])


if __name__ == "__main__":
    solve()

