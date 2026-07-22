# 鉄則問題集A42 固定して全検索
import sys

def solve():
    input_data = map(int, sys.stdin.read().split())
    n, k = next(input_data), next(input_data)
    students = [(next(input_data),next(input_data)) for _ in range(n)]
    answer = 0
    for i in range(1,101):
        for j in range(1, 101):
            total = 0
            for (a, b) in students:
                if i <= a <= i + k and j <= b <= j + k:
                    total += 1
            answer = max(answer, total)
    print(answer)

if __name__ == "__main__":
    solve()