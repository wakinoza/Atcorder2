# 典型T014
import sys


def solve():
    it = map(int, sys.stdin.read().split())
    n = next(it)
    a = [next(it) for _ in range(n)]
    b = [next(it) for _ in range(n)]
    a_sorted = sorted(a)
    b_sorted = sorted(b)
    answer = 0
    for i in range(n):
        answer += abs(a_sorted[i] - b_sorted[i])
    print(answer)

if __name__ == "__main__":
    solve()