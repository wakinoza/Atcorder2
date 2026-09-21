# T016
import sys


def solve():
    n, a, b, c = map(int, sys.stdin.read().split())
    MAX = min(9999, n)
    answer = float('inf')
    for i in range(0, MAX + 1):
        for j in range(0, MAX - i):
            diff = n - (a * i) - (b * j)
            if diff >= 0 and diff % c == 0:
                current_total = i + j + (diff // c)
                if answer > current_total:
                    answer = current_total
    print(answer)

if __name__ == "__main__":
    solve()

