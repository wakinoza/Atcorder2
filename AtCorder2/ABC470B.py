# ABC470B
import sys


def solve():
    n, *c = map(int, sys.stdin.read().split())
    counts = [c.count(i) for i in range(1, n + 1)]
    max_color_count = max(counts)
    print(n - max_color_count)

if __name__ == "__main__":
    solve()

