# 競プロの典型024
import sys


def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, k = next(it), next(it)
    a = [next(it) for _ in range(n)]
    b = [next(it) for _ in range(n)]
    total_diff = sum([abs(a[i] - b[i]) for i in range(n)])
    answer = (total_diff <= k) and ((total_diff - k) % 2 == 0)
    print("Yes" if answer else "No")

if __name__ == "__main__":
    solve()
