# 鉄則問題集A28（あまりの計算）
import sys
import math


def solve():
    DIVIDE = 10000
    it = iter(sys.stdin.read().split())
    n = int(next(it))
    answer = 0
    for _ in range(n) :
        t, a = next(it), int(next(it))
        if t == "+":
            answer = (answer + a) % DIVIDE
        elif t == "-":
            answer = (answer - a) % DIVIDE
        else:
            answer = (answer * a) % DIVIDE
        print(answer)

if __name__ == "__main__":
    solve()