# T048
import sys


def solve():
    it = map(int, sys.stdin.read().split())
    N, K = next(it), next(it)
    exams = [0] * (N * 2)
    for i in range(N):
        A, B = next(it), next(it)
        exams[i * 2] = B
        exams[i * 2 + 1] = A - B
    exams_sorted = sorted(exams, reverse=True)
    answer = sum([exams_sorted[i] for i in range(K)])
    print(answer)

if __name__ == "__main__":
    solve()