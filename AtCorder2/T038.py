# T038
import sys
import math

def solve():
    A, B = map(int, input().split())
    lcm = math.lcm(A, B)
    print("Large" if lcm > 10 ** 18 else lcm)


if __name__ == "__main__":
    solve()
