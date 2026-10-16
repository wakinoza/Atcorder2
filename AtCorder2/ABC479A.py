# ABC479A
import sys



def solve():
    N, *A = map(int, sys.stdin.read().split())
    answer = 0
    for i in range(N):
        if i % 2 == 0:
            answer += A[i]
    print(answer)

if __name__ == "__main__":
    solve()

