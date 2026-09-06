# 鉄則問題集ABC474B
import sys


def solve():
    _, *p = map(int, sys.stdin.read().split())
    for index, seat in enumerate(p):
        min = (index // 10) * 10 + 1
        max = min + 9
        if not min <= seat <= max :
            print("No")
            return
    print("Yes")

if __name__ == "__main__":
    solve()

