# T008.py
import sys


def solve():
    _, S = int(input()), input()
    MOD = 10 ** 9 + 7
    target = "atcoder"
    dp = [0] * (len(target) + 1)
    dp[0] = 1

    for chara in S:
        for j in range(len(target), 0, -1):
            if chara == target[j - 1]:
                dp[j] = (dp[j] + dp[j - 1]) % MOD

    print(dp[len(target)])


if __name__ == "__main__":
    solve()
