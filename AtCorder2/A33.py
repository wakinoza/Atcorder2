# 鉄則問題集A33（必勝法2）
import sys

def solve():
    n, *a= map(int, sys.stdin.read().split())
    XOR_sum = a[0]
    for i in range(1,n):
        XOR_sum = (XOR_sum ^ a[i])
    print("First" if XOR_sum != 0 else "Second")

if __name__ == "__main__":
    solve()