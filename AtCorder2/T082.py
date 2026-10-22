# T082.py
import sys


def solve():
    L, R = map(int, input().split())
    DIVIDE = 10 ** 9 + 7
    answer = 0
    L_len = len(str(L))
    R_len = len(str(R))
    if L_len == R_len :
        answer = L_len * ((L + R) * (R - L + 1) // 2)
        print(answer % DIVIDE)
        return

    answer += L_len * ((L + (10 ** L_len - 1)) * ((10 ** L_len - 1) - L + 1) // 2)
    answer = answer % DIVIDE
    for i in range(L_len + 1, R_len):
        answer += i * (((10 ** (i - 1)) + (10 ** i - 1)) * ((10 ** i - 1) - (10 ** (i - 1)) + 1) // 2)
        answer = answer % DIVIDE
    answer += R_len * (((10 ** (R_len - 1)) + R) * (R - (10 ** (R_len - 1)) + 1) // 2)
    answer = answer % DIVIDE
    print(answer)

if __name__ == "__main__":
    solve()

