# 鉄則問題集A25（DPチャレンジ問題）
import sys
from bisect import bisect_left, bisect_right

import sys


def solve():
    h, w, *grid = sys.stdin.read().split()
    h, w = int(h), int(w)
    dp = [[0] * (w + 1) for _ in range(h + 1)]

    dp[1][1] = 1

    for i in range(1, h + 1):
        row_current = dp[i]
        row_prev = dp[i - 1]

        for j in range(1, w + 1):
            if i == 1 and j == 1:
                continue

            if grid[i - 1][j - 1] == "#":
                continue

            row_current[j] = row_prev[j] + row_current[j - 1]

    print(dp[h][w])


if __name__ == "__main__":
    solve()