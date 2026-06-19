# 鉄則問題集A24（最長増加部分列問題）
import sys
from bisect import bisect_left, bisect_right

def solve():
    n, *a = map(int, sys.stdin.read().split())
    l = [10**18] * n
    len = 0
    for i in range(n):
      pos = bisect_left(l,a[i]);
      if pos < 0:
        pos *= -1 
      l[pos] = a[i]
      if pos == len:
        len += 1

    print(len)

if __name__ == "__main__":
    solve()