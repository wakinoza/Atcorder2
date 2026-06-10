# 鉄則問題集A18（DP）
import sys

def solve():
    n, s, *a = map(int, sys.stdin.read().split())
    dp = [[False] * (s + 1) for i in range(n + 1 )]
    dp[0][0] = True
    for i in range(n):
      for j in range(s + 1):
        if dp[i][j]:
          dp[i + 1][j] = True
          nextSum = j + a[i]
          if nextSum == s:
            print("Yes")
            return
          elif (nextSum < s) :
            dp[i + 1][nextSum] = True
    print("No")


if __name__ == "__main__":
    solve()