# T028.py
import sys
from collections import defaultdict


def solve():
    N, K, *A= iter(map(int, sys.stdin.read().split()))

    count = defaultdict(int)
    distinct = 0
    answer = 0
    r = 0

    for l in range(N):
        while r < N:
            x = A[r]

            if count[x] == 0:
                if distinct == K:
                    break
                distinct += 1
            count[x] += 1
            r += 1

        answer = max(answer, r - l)
        x = A[l]
        count[x] -= 1
        if count[x] == 0:
            distinct -= 1
    print(answer)


if __name__ == "__main__":
    solve()