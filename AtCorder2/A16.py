# 鉄則問題集A16（DP）
import sys

def solve():
    n, *other = map(int, sys.stdin.read().split())
    a, b = other[:n - 1], other[n - 1:]
    dp = [0] * n
    dp[1] = a[0]
    
    for i in range(2, n):
        dp[i] = min(dp[i - 1] + a[i - 1], dp[i - 2] + b[i - 2])
        
    print(dp[-1])

if __name__ == "__main__":
    solve()