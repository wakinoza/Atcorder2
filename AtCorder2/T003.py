# T003.py

import sys
from collections import deque


def bfs(start, G):
    N = len(G)
    dist = [-1] * N
    dist[start] = 0
    que = deque([start])
    while que:
        current = que.popleft()
        for neighbor in G[current]:
            if dist[neighbor] == -1:
                dist[neighbor] = dist[current] + 1
                que.append(neighbor)
    farthest = max(range(N), key=lambda i: dist[i])
    return farthest, dist[farthest]


def solve():
    it = iter(map(int, sys.stdin.buffer.read().split()))
    N = next(it)
    G = [[] for _ in range(N)]
    for _ in range(N - 1):
        A = next(it) - 1
        B = next(it) - 1
        G[A].append(B)
        G[B].append(A)

    start, _ = bfs(0, G)
    _, diameter = bfs(start, G)
    print(diameter + 1)


if __name__ == "__main__":
    solve()
