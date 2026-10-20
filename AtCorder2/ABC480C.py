# ABC480C

import sys


def solve():
    _, K, T, *A = map(int, sys.stdin.read().split())
    A.sort()
    answer = 0
    covered_until = 0

    for start_time in A:
        if start_time > T:
            break
        while covered_until < start_time:
            answer += 1
            covered_until += K
        covered_until = max(covered_until, start_time + K)
        if covered_until >= T:
            break

    while covered_until < T:
        answer += 1
        covered_until += K
    print(answer)


if __name__ == "__main__":
    solve()

