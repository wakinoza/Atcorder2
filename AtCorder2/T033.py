# 競プロの典型033
import sys


def solve():
    h, w = map(int,sys.stdin.read().split())
    if h == 1 or w == 1:
        print(h * w)
        return

    answer = ((h + 1) // 2) * ((w + 1) // 2)
    print(answer)


if __name__ == "__main__":
    solve()
