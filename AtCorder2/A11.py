# 鉄則問題集A11（2分探索）
import sys
from bisect import bisect_left

# sys.setrecursionlimit(10**7)

def solve():
    _, x, *a = map(int, sys.stdin.read().split())
    print(bisect_left(a, x) + 1)

if __name__ == "__main__":
    solve()

