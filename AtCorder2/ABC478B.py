# ABC478B
import sys


def solve():
    N, V, *W = map(int, sys.stdin.read().split())
    W = [0] + W
    answer = 0
    for i in range(1, N - 1):
        for j in range(i + 1, N):
            for k in range(j + 1, N + 1):
                if i + j + k <= V:
                    current_sum = W[i] + W[j] + W[k]
                    answer = max(answer, current_sum)
    print(answer)

if __name__ == "__main__":
    solve()


