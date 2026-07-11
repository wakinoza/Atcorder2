# 鉄則問題集ABC466A（）
import sys

def solve():
    _, *x = map(int, sys.stdin.read().split())
    print("Yes" if all([i < 0 for i in x]) else "No")

if __name__ == "__main__":
    solve()


