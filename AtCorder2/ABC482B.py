# ABC482B
import sys


def solve():
    it = iter(sys.stdin.read().split())
    grid = [[0] * 5 for _ in range(5)]
    for i in range(5):
        line = next(it)
        for j in range(5):
            grid[i][j] = line[j]
    answer = 5
    for i in range(5):
        height = 0
        for j in range(5):
            if grid[i][j] == ".":
                height += 1
        answer = min(answer, height)

    for i in range(5):
        width = 0
        for j in range(5):
            if grid[j][i] == ".":
                width += 1
        answer = min(answer, width)

    diagonal1 = 0
    for k in range(5):
        if grid[k][k] == ".":
            diagonal1 += 1
    answer = min(answer, diagonal1)

    diagonal2 = 0
    for k in range(5):
        if grid[4 - k][k] == ".":
            diagonal2 += 1
    answer = min(answer, diagonal2)
    print(answer)

if __name__ == "__main__":
    solve()
