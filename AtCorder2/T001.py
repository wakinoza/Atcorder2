# T001.py

import sys


def can_make(x, L, K, A):
    last = 0
    count = 0

    for a in A:
        if a - last >= x and L - a >= x:
            last = a
            count += 1

    return count >= K


def solve():
    N, L, K, *A = map(int,sys.stdin.read().split())
    left = 0
    right = L + 1

    while right - left > 1:
        mid = (left + right) // 2

        if can_make(mid, L, K, A):
            left = mid
        else:
            right = mid

    print(left)


if __name__ == "__main__":
    solve()
