# ABC478C
import sys


def solve():
    N, K, *A = map(int, sys.stdin.read().split())
    A_sorted = sorted(A)
    left_index = -1
    while (left_index <= N - 2) and (A_sorted[left_index + 1] == A[left_index + 1]):
        left_index += 1
    right_index = N
    while (right_index >= 1) and (A_sorted[right_index - 1] == A[right_index - 1]):
        right_index -= 1
    if left_index == -1:
        print("Yes" if right_index <= K else "No")
    else:
        print("Yes" if right_index - left_index - 1 <= K else "No")

if __name__ == "__main__":
    solve()

