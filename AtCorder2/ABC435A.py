# ABC435A
import sys

# sys.setrecursionlimit(10**7)

def solve():
    n = int(input())
    answer = sum([ x for x in range(1,n + 1)])

    print(answer)

if __name__ == "__main__":
    solve()

