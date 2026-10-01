# T046
import sys


def solve():
    it = map(int, sys.stdin.read().split())
    N = next(it)
    A = [next(it) for _ in range(N)]
    mod_A = [0] * 46
    for a_num in A:
        mod = a_num % 46
        mod_A[mod] += 1

    B = [next(it) for _ in range(N)]
    mod_B = [0] * 46
    for b_num in B:
        mod = b_num % 46
        mod_B[mod] += 1

    C = [next(it) for _ in range(N)]
    mod_C = [0] * 46
    for c_num in C:
        mod = c_num % 46
        mod_C[mod] += 1

    answer = 0
    for i in range(46):
        for j in range(46):
            for k in range(46):
                if (i + j + k) % 46 == 0:
                    answer += mod_A[i] * mod_B[j] * mod_C[k]

    print(answer)

if __name__ == "__main__":
    solve()