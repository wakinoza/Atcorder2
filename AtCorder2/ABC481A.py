# ABC481A

import sys

# sys.setrecursionlimit(10**7)

def solve():
    A, B = map(int, input().split())
    answer = len(str(A + B))
    print(answer)

if __name__ == "__main__":
    solve()


