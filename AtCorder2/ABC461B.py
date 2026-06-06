# ABC461B（）
import sys

# sys.setrecursionlimit(10**7)

def solve():
    N, *other = map(int, sys.stdin.read().split())
    A, B = other[0:N], other[N:]
    A = [0] + A
    B = [0] + B
    for x in range(1, N + 1):
        if x != B[A[x]] :
            print("No")
            return
    print("Yes")

if __name__ == "__main__":
    solve()
