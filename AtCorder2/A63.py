# 鉄則問題集A63（幅優先探索）
import sys
from collections import deque

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, m = next(it), next(it)
    graf = [[] for i in range(n + 1)]
    for _ in range(m):
        a, b = next(it), next(it)
        graf[a].append(b)
        graf[b].append(a)

    dist = [-1] * (n + 1)
    q = deque()
    q.append(1)
    dist[1] = 0
    while len(q) > 0:
        pos =  q.popleft()
        for i in range(len(graf[pos])) :
            to = graf[pos][i]
            if dist[to] == -1:
                dist[to] = dist[pos] + 1
                q.append(to)
    for i in range(1, n + 1):
        print(dist[i])

if __name__ == "__main__":
    solve()

