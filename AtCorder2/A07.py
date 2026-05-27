
# 鉄則問題集A07（累積和）
import sys
from itertools import accumulate

# sys.setrecursionlimit(10**7)

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    d, n = next(it), next(it)
    answer = [0 for _ in range(d + 1)]
    for _ in range(n):
        l, r = next(it), next(it)
        answer[l] += 1
        if r + 1 <= d :
            answer[r + 1] -= 1
    for x in range(1,d + 1) :
        answer[x] += answer[x - 1]
    answer.pop(0)
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()


