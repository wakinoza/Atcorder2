# ABC464B（）
import sys


def solve():
    h, w, *grid = sys.stdin.read().split()
    h = int(h)
    w = int(w)
    start_x, start_y, end_x, end_y = 0, 0, w - 1, h - 1
    while(True):
        if all([i == "." for i in grid[start_y]]):
            start_y += 1
        else:
            break
    while(True):
        if all([i == "." for i in grid[end_y]]):
            end_y -= 1
        else:
            break
    while(True):
        if all(grid[i][start_x] == "." for i in range(start_y, end_y + 1)):
            start_x += 1
        else:
            break
    while(True):
        if all(grid[i][end_x] == "." for i in range(start_y, end_y + 1)):
            end_x -= 1
        else:
            break
    for i in range(start_y, end_y + 1):
        print(grid[i][start_x:end_x + 1])

if __name__ == "__main__":
    solve()

