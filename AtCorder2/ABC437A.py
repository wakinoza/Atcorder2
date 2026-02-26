import sys

# sys.setrecursionlimit(10**7)

def solve():
    a, b = map(int, input().split())
    answer = 12 * a + b
    print(answer)

if __name__ == "__main__":
    solve()