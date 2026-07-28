# 鉄則問題集A45 不変量に着目する
import sys

def solve():
    _, c, a = sys.stdin.read().split()
    score = 0
    for x in a:
        if x == "B":
            score += 1
        elif x == "R":
            score += 2

    if (score % 3 == 0 and c == "W") or (score % 3 == 1 and c == "B") or (score % 3 == 2 and c == "R"):
        print("Yes")
    else :
        print("No")


if __name__ == "__main__":
    solve()