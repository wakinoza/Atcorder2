# T028.py
import sys
from itertools import accumulate


def solve():
    it = map(int, sys.stdin.read().split())
    N = next(it)
    MAX = 1000
    grid = [[0] * (MAX + 2) for _ in range(MAX + 2)]
    for _ in range(N):
        lx, ly, rx, ry = next(it), next(it), next(it), next(it)
        grid[lx][ly] += 1
        grid[lx][ry] -= 1
        grid[rx][ly] -= 1
        grid[rx][ry] += 1
    for i in range(MAX + 2):
        for j in range(1, MAX + 2):
            grid[i][j] += grid[i][j - 1]
    for i in range(MAX + 2):
        for j in range(1, MAX + 2):
            grid[j][i] += grid[j - 1][i]
    results = [0] * (N + 1)
    for i in range(MAX):
        for j in range(MAX):
            results[grid[i][j]] += 1
    print("\n".join(map(str, results[1:N + 1])))


if __name__ == "__main__":
    solve()
