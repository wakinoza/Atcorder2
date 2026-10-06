# T050
import sys


def solve():
    N, L = map(int, sys.stdin.read().split())
    dp = [0] * (N + 1)
    dp[0] = 1
    for i in range(1, N + 1):
        if dp[i - 1] >= 1:
            dp[i] += dp[i - 1]
        if i - L >= 0 and dp[i - L] >= 1:
            dp[i] += dp[i - L]
    answer = dp[N] % (10 ** 9 + 7)
    print(answer)

if __name__ == "__main__":
    solve()