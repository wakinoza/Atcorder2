# 鉄則問題集A12（2分探索）
import sys
import sys

def solve():
    n, k, *a = map(int, sys.stdin.read().split())

    def check(x):
        total_prints = sum(x // s for s in a)
        return total_prints >= k


    left = 1
    right = 10**9
    while left < right:
        mid = (left + right) // 2
        if check(mid):
            right = mid
        else:
            left = mid + 1
    print(left)

if __name__ == "__main__":
    solve()