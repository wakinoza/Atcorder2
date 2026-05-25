# 鉄則問題集A02（全検索）
import sys

# sys.setrecursionlimit(10**7)

def solve():
    _, x, *a = map(int, sys.stdin.read().split())
    print("Yes" if x in a else "No")

if __name__ == "__main__":
    solve()

