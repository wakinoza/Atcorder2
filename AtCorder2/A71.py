# 鉄則問題集A71
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n = next(it)
    a = [next(it) for _ in range(n)]
    b = [next(it) for _ in range(n)]
    a_sorted = sorted(a)
    b_sorted_reverse =  sorted(b, reverse=True)
    answer = sum([a_sorted[i] * b_sorted_reverse[i] for i in range(n)])
    print(answer)

if __name__ == "__main__":
    solve()

