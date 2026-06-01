# 鉄則問題集A10(累積和）
import sys
from itertools import accumulate

def solve():
    it = map(int, sys.stdin.read().split())
    n = next(it)
    a = [0] + [next(it) for _ in range(n)] + [0]
    a_max_from_left = list(accumulate(a, max))
    a_max_from_right = list(accumulate(a[::-1], max))[::-1]

    d = next(it)
    answers = []
    for _ in range(d):
        l, r = next(it), next(it)
        answers.append(str(max(a_max_from_left[l - 1], a_max_from_right[r + 1])))

    print("\n".join(answers))

if __name__ == "__main__":
    solve()