# 鉄則問題集A29（あまりの計算）
import sys
import math


def solve():
    DIVIDE = 1_000_000_007
    a, b = map(int, input().split())
    answer = pow(a, b, DIVIDE)
    print(answer)

if __name__ == "__main__":
    solve()