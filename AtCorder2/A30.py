# 鉄則問題集A30（あまりの計算）
import sys
import math


def solve():
    MOD = 1_000_000_007
    n, r = map(int, input().split())
    fact_n = math.factorial(n)
    fact_r_nr = math.factorial(r) * math.factorial(n - r)
    answer = (fact_n * pow(fact_r_nr, -1, MOD)) % MOD
    print(answer)

if __name__ == "__main__":
    solve()