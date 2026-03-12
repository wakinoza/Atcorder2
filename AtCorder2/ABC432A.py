# ABC432A
import sys

# sys.setrecursionlimit(10**7)

def solve():
    l = list(map(int, input().split()))
    l_reverse_sorted = sorted(l, reverse=True)
    print("".join(map(str, l_reverse_sorted)))

if __name__ == "__main__":
    solve()

