# 鉄則問題集A38（上限値を考える）
import sys

def solve():
    input_data = map(int, sys.stdin.read().split())
    d, n = next(input_data), next(input_data)
    days = [0] + [24 for _ in range(d)]
    for _ in range(n):
        l, r, h = next(input_data), next(input_data), next(input_data)
        for x in range(l, r+1):
            if days[x] > h :
                days[x] = h
    print(sum(days))

if __name__ == "__main__":
    solve()