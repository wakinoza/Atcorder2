# T079
import sys


def solve():
    it = map(int, sys.stdin.read().split())
    H, W = next(it), next(it)
    A = [[0] * W for _ in range(H)]
    A_sum = 0
    for i in range(H):
        for j in range(W):
            A[i][j] = next(it)
            A_sum += A[i][j]
    B = [[0] * W for _ in range(H)]
    B_sum = 0
    for i in range(H):
        for j in range(W):
            B[i][j] = next(it)
            B_sum += B[i][j]
    mod = abs(A_sum - B_sum) % 4
    if mod != 0:
        print("No")
        return
    else:
        count = 0
        for i in range(H - 1):
            for j in range(W - 1):
                if A[i][j] != B[i][j]:
                    diff = A[i][j] - B[i][j]
                    A[i][j] -= diff
                    A[i + 1][j] -= diff
                    A[i][j + 1] -= diff
                    A[i + 1][j + 1] -= diff
                    count += abs(diff)
    for i in range(W):
        if A[H - 1][i] != B[H - 1][i]:
            print("No")
            return
    for i in range(H):
        if A[i][W - 1] != B[i][W - 1]:
            print("No")
            return
    print("Yes")
    print(count)


if __name__ == "__main__":
    solve()

