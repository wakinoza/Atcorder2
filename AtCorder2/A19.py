# 鉄則問題集A19（1次元DP、ナップザック問題）
import sys

def solve():
    input_data = map(int, sys.stdin.read().split())
    n, w = next(input_data), next(input_data)
    dp = [-1] * (w + 1)
    dp[0] = 0
    for _ in range(n):
        weight, value = next(input_data), next(input_data)
        for j in range(w, weight - 1, -1):
            if dp[j - weight] != -1:
                new_value = dp[j - weight] + value
                if new_value > dp[j]:
                    dp[j] = new_value

    print(max(dp))


if __name__ == "__main__":
    solve()