
# ABC479C
import sys


def solve():
    it = map(int, sys.stdin.read().split())
    N, W = next(it), next(it)
    foods = [(next(it), next(it)) for _ in range(N)]
    answer = 0
    for i in range(1, 2 ** N):
        bin_i = format(i, 'b').zfill(N)
        A_sum = 0
        B_sum = 0
        for j in range(N):
            if bin_i[j] == '1':
                A_sum += foods[j][0]
                B_sum += foods[j][1]
        if B_sum <= W:
            answer = max(answer, A_sum)
    print(answer)

if __name__ == "__main__":
    solve()

