import sys

# sys.setrecursionlimit(10**7)

def solve():
    x, y = map(int, input().split())
    print(x * pow(2, y))

if __name__ == "__main__":
    solve()
