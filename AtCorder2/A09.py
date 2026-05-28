# 鉄則問題集A09（2次元いもす法）
import sys

def solve():
    it = map(int, sys.stdin.read().split())
    h, w, n = next(it), next(it), next(it)
    sum_grid = [[0] * (w + 2) for _ in range(h + 2)]
    for _ in range(n):
        a, b ,c, d = next(it), next(it), next(it), next(it)
        sum_grid[a][b] += 1
        sum_grid[c + 1][d + 1] += 1
        sum_grid[a][d + 1] -= 1
        sum_grid[c + 1][b] -= 1

    for i in range(1, h + 1):
        for j in range(1, w + 1):
            sum_grid[i][j] += sum_grid[i][j - 1]
    for i in range(1, h + 1):
        for j in range(1, w + 1):
            sum_grid[i][j] += sum_grid[i - 1][j]

    answers = []
    for i in range(1, h + 1):
        answers.append(" ".join(map(str, sum_grid[i][1:w + 1])))
    print("\n".join(answers))


if __name__ == "__main__":
    solve()


