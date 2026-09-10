# 競プロの典型055
import sys


def solve():
    n, p, q, *a = map(int,sys.stdin.read().split())
    mod_a = [a[i] % p for i in range(n)]
    answer = 0
    for i1 in range(n - 4):
        for i2 in range(i1 + 1, n - 3):
            product12 = ((mod_a[i1] * mod_a[i2]) % p)
            for i3 in range(i2 + 1, n - 2):
                product123 = (product12 * mod_a[i3]) % p
                for i4 in range(i3 + 1, n - 1):
                    product1234 = (product123 * mod_a[i4]) % p
                    for i5 in range(i4 + 1, n):
                        product12345 = (product1234 * mod_a[i5]) % p
                        if product12345 == q:
                            answer += 1
    print(answer)


if __name__ == "__main__":
    solve()
