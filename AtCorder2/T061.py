# 競プロの典型061
import sys
from collections import deque


def solve():
    it = map(int,sys.stdin.read().split())
    q = next(it)
    results = []
    d = deque()
    for _ in range(q):
        t, x = next(it), next(it)
        if t == 1:
            d.appendleft(x)
        elif t == 2:
            d.append(x)
        else:
            results.append(d[x - 1])
    print("\n".join(map(str, results)))


if __name__ == "__main__":
    solve()
