# ABC470A
import sys


def solve():
    n = int(input())
    answer = ["Fizz" if i % 3 == 0 else i for i in range(1,n + 1)]
    print("\n".join(map(str, answer)))


if __name__ == "__main__":
    solve()

