# 鉄則問題集A27（最大公約数）
import sys
import math


def solve():
    a, b = map(int, input().split())
    print(math.gcd(a,b))

if __name__ == "__main__":
    solve()