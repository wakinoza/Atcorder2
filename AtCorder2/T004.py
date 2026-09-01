# 競プロ典型004
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    h, w = next(it), next(it)
    grid = [[next(it) for _ in range(w)] for _ in range(h)]

    h_sum = [sum(row) for row in grid]

    w_sum = [sum(col) for col in zip(*grid)]

    answer = []
    for i in range(h):
        results = []
        for j in range(w):
            current_sum = h_sum[i] + w_sum[j] - grid[i][j]
            results.append(current_sum)
        answer.append(" ".join(map(str, results)))
    print("\n".join(answer))

if __name__ == "__main__":
    solve()

