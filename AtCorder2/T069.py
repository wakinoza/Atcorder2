# T069
import sys

def solve():
    N, K = map(int, input().split())

    MOD = 10**9 + 7

    if N == 1:
        print(K % MOD)
        return

    answer = K * (K - 1) * pow(K - 2, N - 2, MOD) % MOD

    print(answer)

if __name__ == "__main__":
    solve()