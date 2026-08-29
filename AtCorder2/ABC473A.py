# ABC473A
import sys

def solve():
    n, *a = map(int, sys.stdin.read().split())
    answer = 0
    for i in range(n):
        if i >= (n // 2):
            answer += a[i]
    print(answer)



if __name__ == "__main__":
    solve()
