# 競プロの典型067
import sys
from collections import deque


def solve():
    n, k = sys.stdin.read().split()
    k = int(k)
    prev_base8 = n
    for _ in range(k):
        int_n = int(prev_base8, 8)
        base9 = get_base9(int_n)
        next_base8 = ""
        for num in base9:
            if num == '8':
                next_base8 = next_base8 + '5'
            else:
                next_base8 = next_base8 + num
        prev_base8 = next_base8
    print(prev_base8)

def get_base9(n):
    if n == 0:
        return "0"
    res = ""
    while n > 0:
        res = str(n % 9) + res
        n //= 9
    return res

if __name__ == "__main__":
    solve()
