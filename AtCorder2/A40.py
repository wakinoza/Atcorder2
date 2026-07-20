# 鉄則問題集A40 個数を考える
import sys

def solve():
    _, *a = map(int, sys.stdin.read().split())
    answer = 0
    for i in range(1, 101) :
        count = a.count(i)
        if count >= 3 :
            answer += (count * (count - 1) * (count - 2)) / 6
    print(int(answer))

if __name__ == "__main__":
    solve()