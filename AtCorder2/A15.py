# 鉄則問題集A15（2分探索チャレンジ）
import sys
from bisect import bisect_left
# sys.setrecursionlimit(10**7)

def solve():
    _, *a = map(int, sys.stdin.read().split())
    a_sorted_uniq = [0] + sorted(list(set(a)))
    answer = [bisect_left(a_sorted_uniq, x) for x in a]
    print(" ".join(map(str, answer)))

if __name__ == "__main__":
    solve()