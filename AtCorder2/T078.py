# 典型T078
import sys


def solve():
    it = map(int, sys.stdin.read().split())
    n, m = next(it), next(it)
    graf = [[] for _ in range(n)]
    for _ in range(m):
        a, b = next(it) - 1, next(it) - 1
        graf[a].append(b)
        graf[b].append(a)
    answer = 0
    for i in range(n):
        v_list = graf[i]
        small_vertex_total = 0
        for v in v_list:
            if v < i + 1:
                small_vertex_total += 1
        if small_vertex_total == 1:
            answer += 1

    print(answer)

if __name__ == "__main__":
    solve()