# 鉄則問題集A06（累積和）
import sys
from itertools import accumulate

# sys.setrecursionlimit(10**7)

def solve():
    n, q, *other = map(int, sys.stdin.read().split())
    a, lr = other[0:n], iter(other[n:])
    refix_sum = list(accumulate(a, initial=0))
    for _ in range(q):
        l, r = next(lr), next(lr)
        answer = refix_sum[r] - refix_sum[l - 1]
        print(answer)

if __name__ == "__main__":
    solve()


