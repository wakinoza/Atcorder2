# 鉄則問題集A37（足された数を考える）
import sys

def solve():
    input_data = map(int, sys.stdin.read().split())
    n, m, b = next(input_data), next(input_data), next(input_data)
    a = [next(input_data) for _ in range(n)]
    c = [next(input_data) for _ in range(m)]
    answer = sum(a) * len(c) + b * (len(a) * len(c)) + sum(c) * len(a)
    print(answer)

if __name__ == "__main__":
    solve()