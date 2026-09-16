# 典型T007
import sys
from bisect import bisect_left


def solve():
    it = map(int, sys.stdin.read().split())
    n = next(it)
    a = [next(it) for _ in range(n)]
    a_sorted = sorted(a)
    q = next(it)
    results = []
    for _ in range(q):
        b = next(it)
        index = bisect_left(a_sorted, b)
        diff = 0
        if index == 0:
            diff = abs(a_sorted[index] - b)
        elif index == n:
            diff = abs(a_sorted[index - 1] - b)
        else:
            diff = min(abs(a_sorted[index] - b), abs(a_sorted[index - 1] - b))
        results.append(diff)

    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()