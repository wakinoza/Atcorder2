# 競プロの典型022
import sys
import math

def solve():
    a, b, c = map(int, sys.stdin.read().split())
    r = math.gcd(a, b, c)
    answer = (a // r - 1) + (b // r - 1) + (c // r - 1)
    print(answer)

if __name__ == "__main__":
    solve()
