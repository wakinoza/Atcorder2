# T084.py
import sys


def solve():
    N = int(input())
    S = input()
    answer = N * (N + 1) // 2
    count = 1

    for i in range(1, N):
        if S[i] == S[i - 1]:
            count += 1
        else:
            answer -= count * (count + 1) // 2
            count = 1

    answer -= count * (count + 1) // 2

    print(answer)

if __name__ == "__main__":
    solve()

