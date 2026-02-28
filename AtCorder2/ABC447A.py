# ABC447A
import sys

# sys.setrecursionlimit(10**7)

def solve():
    n, m = map(int, input().split())
    if (n + 1) // 2 >= m :
        print("Yes")
    else :
        print("No")

if __name__ == "__main__":
    solve()

