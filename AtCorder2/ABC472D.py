# ABC472D（）
import sys
from collections import deque


def solve():
    h, w, k, *grid = sys.stdin.read().split()
    h, w, k = int(h), int(w), int(k)
    is_bomb_line = [False] * h
    is_bomb_column = [False] * w
    for i in range(h):
        for j in range(w):
            if grid[i][j] == "#":
                is_bomb_line[i] = True
                is_bomb_column[j] = True
    safe_position = deque()
    dis_from_safe = [[-1] * w for _ in range(h)]
    answer = 0
    for i in range(h):
        if is_bomb_line[i]:
            continue
        for j in range(w):
            if not is_bomb_line[i] and not is_bomb_column[j]:
                safe_position.append((i, j))
                dis_from_safe[i][j] = 0
                answer += 1
    pos = [(1, 0), (-1, 0), (0, 1), (0, -1)]
    while len(safe_position) > 0:
        i, j = safe_position.popleft()
        current_dis = dis_from_safe[i][j]
        for index in range(4):
            next_i, next_j = i + pos[index][0], j + pos[index][1]
            if next_i < 0 or next_i >= h or next_j < 0 or next_j >= w or grid[next_i][next_j] == "#" or dis_from_safe[next_i][next_j] >= 0:
                continue
            if current_dis + 1 <= k:
                answer += 1
                dis_from_safe[next_i][next_j] = current_dis + 1
            if current_dis + 1 <= k - 1:
                safe_position.append((next_i, next_j))
    print(answer)

if __name__ == "__main__":
    solve()
