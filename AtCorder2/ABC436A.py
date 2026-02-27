import sys

# sys.setrecursionlimit(10**7)

def solve():
    n = int(input())
    s = input()
    diff = n - len(s)
    answer = "o" * diff + s

    print(answer)

if __name__ == "__main__":
    solve()
