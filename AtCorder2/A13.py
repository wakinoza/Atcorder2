# 鉄則問題集A13（2分探索）
import sys
from bisect import bisect_right

def solve():
    n, k, *a = map(int, sys.stdin.read().split())
    answer = 0
    right = 0
    for left in range(n):
        while right < n and a[right] - a[left] <= k:
            right += 1
        answer += right - 1 - left
    print(answer)

if __name__ == "__main__":
    solve()