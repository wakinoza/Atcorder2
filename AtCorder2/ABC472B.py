# ABC472B（）
import sys

def solve():
    n, *l = map(int, sys.stdin.read().split())
    right_total = sum(l)
    left_total = 0
    answer = float('inf')
    for i in range(n):
        right_total -= l[i]
        left_total += l[i]
        dis = abs(right_total - left_total)
        if (dis < answer):
            answer = dis
    print(answer)

if __name__ == "__main__":
    solve()

