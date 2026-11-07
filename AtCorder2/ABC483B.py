# ABC483B

import sys


def solve():
    N, _, *K = map(int, sys.stdin.read().split())
    cards = [0] + [i for i in range(1, N + 1)]
    for k in K:
        for i in range(1, (k + 1) // 2 + 1):
            temp = cards[i]
            cards[i] = cards[k + 1 - i] * (-1)
            cards[k + 1 - i] = temp * (-1)

    print("\n".join(map(str, cards[1:])))

if __name__ == "__main__":
    solve()

