# 鉄則問題集A13（2分探索）
import sys
from bisect import bisect_right

def solve():
    n, k, *a = map(int, sys.stdin.read().split())
    answer = 0
    for i in range(n - 1):
        target = a[i] + k
        right_index = bisect_right(a, target, lo=i + 1)
        answer += right_index - (i + 1)
    print(answer)

if __name__ == "__main__":
    solve()