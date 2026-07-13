# 鉄則問題集A36（偶奇を考える）
import sys

def solve():
    n, k= map(int, sys.stdin.read().split())
    print("Yes" if k >= n * 2 - 2 and k % 2 == 0 else "No")

if __name__ == "__main__":
    solve()