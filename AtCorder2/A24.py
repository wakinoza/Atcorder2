# 鉄則問題集A24（最長増加部分列問題）
import sys
from bisect import bisect_left, bisect_right

def solve():
    n, *a = map(int, sys.stdin.read().split())
    L = []
    for x in a:
      pos = bisect_left(L,x);

      if pos == len(L):
        L.append(x)
      else :
        L[pos] = x

    print(len(L))

if __name__ == "__main__":
    solve()