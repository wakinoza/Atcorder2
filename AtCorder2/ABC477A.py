# ABC477A
import sys


def solve():
    c = input()
    answer = ""
    if c == "B":
        answer = "Y"
    elif c == "Y":
        answer = "R"
    else:
        answer = "B"
    print(answer)

if __name__ == "__main__":
    solve()

