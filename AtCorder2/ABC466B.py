# 鉄則問題集ABC466B（）
import sys

# sys.setrecursionlimit(10**7)

def solve():
    input_data = iter(map(int, sys.stdin.read().split()))
    n, m = next(input_data), next(input_data)
    maxS = [-1 for _ in range(m + 1)]
    for _ in range(n):
        c, s = next(input_data), next(input_data)
        if maxS[c] < s:
            maxS[c] = s
    print(" ".join(map(str, maxS[1:])))


if __name__ == "__main__":
    solve()

