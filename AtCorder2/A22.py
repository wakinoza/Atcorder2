# 鉄則問題集A22（DP）
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n = next(it)
    a = [next(it) - 1 for _ in range(n - 1)]
    b = [next(it) - 1 for _ in range(n - 1)]
    INF = 10**18
    dp = [-INF] * n
    dp[0] = 0
    for i in range(n - 1):
        current_score = dp[i]
        if current_score < 0:
            continue
        dp[a[i]] = max(dp[a[i]], current_score + 100)
        dp[b[i]] = max(dp[b[i]], current_score + 150)
    print(max(dp))

if __name__ == "__main__":
    solve()