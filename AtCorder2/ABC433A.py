# ABC433A
import sys

# sys.setrecursionlimit(10**7)

def solve():
    X, Y, Z = map(int, input().split())
    answer = "Yes" if (X - Y * Z) % (Z - 1) == 0 and X - Y * Z >= 0 else "No"
    print(answer)

if __name__ == "__main__":
    solve()

