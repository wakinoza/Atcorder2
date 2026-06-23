# 鉄則問題集A26（素数判定問題）
import sys
import math


def solve():
    input_data = iter(map(int,sys.stdin.read().split()))
    n = next(input_data)
    for _ in range(n):
        x = next(input_data)
        print("Yes" if is_prime(x) else "No")

def is_prime(number):
    if number <= 1:
        return False
    if number == 2:
        return True
    if number % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(number)) + 1, 2):
        if number % i == 0:
            return False
    return True


if __name__ == "__main__":
    solve()