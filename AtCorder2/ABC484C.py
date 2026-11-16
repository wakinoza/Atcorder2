# ABC484C
import sys

def solve():
    it = map(int, sys.stdin.read().split())
    N = next(it)
    A = [next(it) for _ in range(N)]
    B = [next(it) for _ in range(N)]

    l = -1
    for i in range(N):
        if A[i] != B[i]:
            l = i
            break

    if l == -1:
        print("Yes")
        return

    q = l
    while q < N - 1 and B[q] == A[q + 1]:
        q += 1

    if B[q] == A[l]:
        if all(A[i] == B[i] for i in range(q + 1, N)):
            print("Yes")
            return

    q = l + 1
    while q < N and B[q] == A[q - 1]:
        q += 1

    p = q - 1

    if B[l] == A[p]:
        if all(A[i] == B[i] for i in range(p + 1, N)):
            print("Yes")
            return

    print("No")

if __name__ == "__main__":
    solve()
