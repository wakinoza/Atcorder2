# ABC434A
import sys

# sys.setrecursionlimit(10**7)

def solve():
    W, B = map(int, input().split())

    print(W * 1000 // B + 1)

if __name__ == "__main__":
    solve()


# s = input()
# n = int(input())
# n, m = map(int, input().split())