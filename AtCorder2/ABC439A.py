import sys

# sys.setrecursionlimit(10**7)

def solve():
    n = int(input())
    answer = pow(2, n) - 2 * n
    print(answer)

if __name__ == "__main__":
    solve()

