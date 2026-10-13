#T075
import math


def solve():
    n = int(input())
    count = 0
    p = 2

    while p * p <= n:
        while n % p == 0:
            n //= p
            count += 1

        p += 1

    if n > 1:
        count += 1

    answer = 0
    power = 1

    while power < count:
        power *= 2
        answer += 1

    print(answer)


if __name__ == "__main__":
    solve()