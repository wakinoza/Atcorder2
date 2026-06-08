# 鉄則問題集A16（DP）
import sys

def solve():
    n, *other = map(int, sys.stdin.read().split())
    a, b = other[:n - 1], other[n - 1:]
    a = [0, 0] + a
    b = [0, 0, 0] + b
    dp = [0, 0, a[2]]
    for x in range(3, n + 1):
        dp.append(min(dp[x - 2] + b[x], dp[x - 1] + a[x]))
    print(dp[x])

if __name__ == "__main__":
    solve()