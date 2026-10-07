# T052
import sys


def solve():
    it = map(int, sys.stdin.read().split())
    N = next(it)
    answer = 1
    for _ in range(N):
        dice_sum = 0
        for _ in range(6):
            dice_sum += next(it)
        answer = (answer * dice_sum) % (10 ** 9 + 7)
    print(answer)

if __name__ == "__main__":
    solve()# T052
import sys

