
# 鉄則問題集A08（ 2次元リストの累積和）
import sys
from itertools import accumulate

# sys.setrecursionlimit(10**7)

def solve():
    h, w, *other = map(int, sys.stdin.read().split())
    grid = []
    for _ in range(h) :
        line = other[:w]
        other = other[w:]
        grid.append(line)

    sumGrid = [[0] * (w + 1) for _ in range(h + 1)]
    for i in range(h):
        for j in range(w):
            sumGrid[i + 1][j + 1] = sumGrid[i][j + 1] + sumGrid[i + 1][j] - sumGrid[i][j] + grid[i][j]

    answer = []
    other = iter(other)
    q = next(other)
    for _ in range(q) :
        a, b, c, d = next(other), next(other), next(other), next(other)
        currentSum = sumGrid[c][d] - sumGrid[a - 1][d] - sumGrid[c][b - 1] + sumGrid[a - 1][b - 1]
        answer.append(currentSum)
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()


