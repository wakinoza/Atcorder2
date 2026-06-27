# ABC464A（）
import sys


def solve():
    s = input()
    e_count = 0
    w_count = 0
    for letter in s:
        if letter == "E":
            e_count += 1
        else:
            w_count += 1
    print("East" if e_count >= w_count else "West")


if __name__ == "__main__":
    solve()

