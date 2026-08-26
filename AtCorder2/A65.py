# 鉄則問題集A65（木に対する動的計画法）
import sys

def solve():
    n, *a = map(int, sys.stdin.read().split())
    a = [0, 0] + a
    graf = [[] for _ in range(n + 1)]
    for i in range(2, n + 1):
        graf[a[i]].append(i)

    dp = [0] * (n + 1)
    for i in range(n, 0, -1):
        for child in graf[i]:
            dp[i] += dp[child] + 1

    print(" ".join(map(str, dp[1:])))

if __name__ == "__main__":
    solve()

