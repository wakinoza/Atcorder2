# T020
import sys



def solve():
    a, b ,c = map(int, sys.stdin.read().split())
    print("Yes" if a < c ** b  else "No")

if __name__ == "__main__":
    solve()
