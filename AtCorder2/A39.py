# 鉄則問題集A39（区間スケジュール問題）
import sys

def solve():
    input_data = map(int, sys.stdin.read().split())
    n = next(input_data)
    movies = [(next(input_data), next(input_data)) for _ in range(n)]
    movies.sort(key=lambda x: x[1])
    answer = 0
    current_time = 0
    for l, r in movies :
        if l >= current_time :
            answer += 1
            current_time = r
    print(answer)

if __name__ == "__main__":
    solve()