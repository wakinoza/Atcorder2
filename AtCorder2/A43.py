# 鉄則問題集A43 問題を言い換える
import sys

def solve():
    input_data = iter(sys.stdin.read().split())
    n, l = int(next(input_data)), int(next(input_data))
    answer = 0
    for _ in range(n):
        a, b = int(next(input_data)),next(input_data)
        time = a if b == "W" else l - a
        answer = max(answer, time)
    print(answer)

if __name__ == "__main__":
    solve()