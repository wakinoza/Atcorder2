# T044
import sys
from collections import deque


def solve():
    it = map(int, sys.stdin.read().split())
    N, Q = next(it), next(it)
    A = deque()
    for _ in range(N):
        A.append(next(it))
    results = []
    for _ in range(Q):
        t, x, y = next(it), next(it) - 1, next(it) -  1
        if t == 1:
            temp = A[x]
            A[x] = A[y]
            A[y] = temp

        elif t == 2:
            temp = A.pop()
            A.appendleft(temp)

        else:
            results.append(A[x])
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()