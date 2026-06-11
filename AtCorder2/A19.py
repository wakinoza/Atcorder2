# 鉄則問題集A19（DP、ナップザック問題）
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, w = next(it), next(it)
    goods = [(next(it), next(it)) for _ in range(n)]
    dp = [[-1] * (w + 1) for i in range(n + 1)]
    dp[0][0] = 0
    answer = 0
    for i in range(n):
        for j in range(w + 1):
            prev_value = dp[i][j]
            if prev_value >= 0:
                dp[i + 1][j] = max(prev_value, dp[i + 1][j])
                next_weight = j + goods[i][0]
                if next_weight <= w:
                    next_value = max(dp[i + 1][next_weight], prev_value + goods[i][1])
                    dp[i + 1][next_weight] = next_value
                    if answer < next_value:
                        answer = next_value
    print(answer)


if __name__ == "__main__":
    solve()