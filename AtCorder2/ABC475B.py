# ABC475B
import sys

def solve():
    _, *a_list = map(int, sys.stdin.read().split())
    cash = [0, 0, 0]
    for a in a_list :
        if a % 1000 == 0:
            continue
        change = 1000 - (a % 1000)
        i = 2
        while change > 0:
            cash[i] += change // (10 ** i)
            change = change % (10 ** i)
            i -= 1

    print(" ".join(map(str, cash)))

if __name__ == "__main__":
    solve()

