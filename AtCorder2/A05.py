# 鉄則問題集A05（）
import sys

# sys.setrecursionlimit(10**7)

def solve():
    n, k = map(int, input().split())
    answer = 0
    for i in range(1,n + 1):
        for j in range(1,n + 1):
            diff = k - i - j
            if 1 <= diff <= n:
                answer += 1
    print(answer)

if __name__ == "__main__":
    solve()


