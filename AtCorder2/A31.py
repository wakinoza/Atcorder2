# 鉄則問題集A31（包除原理）
import sys


def solve():
    n = int(input())
    print(n // 3 + n // 5 - n // 15)

if __name__ == "__main__":
    solve()