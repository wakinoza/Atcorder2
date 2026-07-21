# 鉄則問題集A41 後ろから考える
import sys

def solve():
    _, S = sys.stdin.read().split()
    if "RRR" in S or "BBB" in S:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    solve()