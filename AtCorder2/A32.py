# 鉄則問題集A32（必勝法）
import sys

def solve():
    n, a, b = map(int, input().split())
    dp = [False for _ in range(n + 1)]
    for i in range(n + 1):
        if i >= a and dp[i - a] == False:
            dp[i] = True
        elif i >= b and dp[i - b] == False:
            dp[i] = True
        else:
            dp[i] = False
    print("First" if dp[n] else "Second")

if __name__ == "__main__":
    solve()