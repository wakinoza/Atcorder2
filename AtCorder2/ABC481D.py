# ABC481D

import sys
from collections import deque


def solve():
    it = iter(map(int, sys.stdin.buffer.read().split()))
    N, M, S, T = next(it), next(it), next(it) - 1, next(it) - 1
    G = [[] for _ in range(N)]
    for _ in range(M):
        A, B = next(it) - 1, next(it) - 1
        G[A].append(B)

    free_target = [
        min(neighbors) if neighbors else -1
        for neighbors in G
    ]
    INF = float("inf")
    dist = [INF] * N
    dist[S] = 0
    que = deque([(0, S)])
    while que:
        current_fuel, u = que.popleft()
        if current_fuel != dist[u]:
            continue

        for v in G[u]:
            cost = 0 if v == free_target[u] else 1
            next_fuel = current_fuel + cost
            if next_fuel < dist[v]:
                dist[v] = next_fuel
                if cost == 0:
                    que.appendleft((next_fuel, v))
                else:
                    que.append((next_fuel, v))
    print(-1 if dist[T] == INF else dist[T])


if __name__ == "__main__":
    solve()
