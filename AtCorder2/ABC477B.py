# ABC477B
import sys


def solve():
    N, D, *X = map(int, sys.stdin.read().split())
    results = []
    for i in range(N):
        current_x = X[i]
        stand_outlier = True
        for j in range(N):
            if j == i:
                continue
            if current_x - D < X[j] < current_x + D:
                stand_outlier = False
                break
        if stand_outlier:
            results.append(i + 1)
    print(len(results))
    results_sorted = sorted(results)
    print(" ".join(map(str, results_sorted)))

if __name__ == "__main__":
    solve()

