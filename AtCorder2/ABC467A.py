#ABC466A（）
import sys

def solve():
    h, w = map(int, sys.stdin.read().split())
    print("Yes" if 10000 * w >= 25 * h * h else "No")

if __name__ == "__main__":
    solve()


