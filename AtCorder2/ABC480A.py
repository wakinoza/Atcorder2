# ABC480A
import sys


def solve():
    grid = sys.stdin.read().split()
    answer = "Yes"
    if grid[0][0] == "A" and grid[1][1] == "D":
        answer = "No"
    elif grid[1][1] == "A" and grid[0][0] == "D":
        answer = "No"
    elif grid[0][1] == "A" and grid[1][0] == "D":
        answer = "No"
    elif grid[1][0] == "A" and grid[0][1] == "D":
        answer = "No"
    print(answer)

if __name__ == "__main__":
    solve()

