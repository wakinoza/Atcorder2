# ABC482A
import sys

# sys.setrecursionlimit(10**7)

def solve():
    s = input()
    print("even" if s.count('o') % 2 == 0 else "odd")

if __name__ == "__main__":
    solve()

