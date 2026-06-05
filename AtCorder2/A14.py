# 鉄則問題集A14（半分全列挙）
import sys

# sys.setrecursionlimit(10**7)

def solve():
    n, k, *other = map(int, sys.stdin.read().split())
    a, b, c, d = other[:n], other[n:n * 2], other[n * 2:n * 3], other[n * 3:]
    sum_ab = []
    for i in a:
        for j in b:
            sum_ab.append(i + j)
    sum_cd = set()
    for i in c:
        for j in d:
            sum_cd.add(i + j)    
    if any((k - x) in sum_cd for x in sum_ab):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    solve()

