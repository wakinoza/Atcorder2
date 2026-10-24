# ABC481B

import sys


def solve():
    N, K, *A = map(int, sys.stdin.read().split())
    answer = 0
    for i in range(N - 1):
        if A[i] > K and A[i + 1] < K:
            answer += 1
        elif A[i] < K and A[i + 1] > K:
            answer += 1
        elif A[i] == K:
            answer += 1
    if A[N - 1] == K:
        answer += 1
    print(answer)

if __name__ == "__main__":
    solve()

