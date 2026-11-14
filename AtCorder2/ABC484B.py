# ABC484B
import sys

def solve():
    _, *A = map(int, sys.stdin.read().split())
    answer = -1
    if 9 in A:
        answer = min(A)
    print(answer)

if __name__ == "__main__":
    solve()

