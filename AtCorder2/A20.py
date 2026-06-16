# 鉄則問題集A20（DP、最長共有部分列問題）
import sys

def solve():
    s, t = sys.stdin.read().split()
    dp = [[0] * (len(t) + 1) for _ in range(len(s) + 1)]

    for i, char_s in enumerate(s):
        for j, char_t in enumerate(t):
            if char_s == char_t:
                dp[i + 1][j + 1] = max(dp[i][j + 1], dp[i + 1][j], dp[i][j] + 1)
            else:
                dp[i + 1][j + 1] = max(dp[i][j + 1], dp[i + 1][j])

    print(dp[-1][-1])


if __name__ == "__main__":
    solve()