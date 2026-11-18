
# T043.py
import sys
from collections import deque


def solve():
    H, W, rs, cs, rt, ct, *grid = sys.stdin.read().split()
    H, W = int(H), int(W)
    rs, cs = int(rs) - 1, int(cs) - 1
    rt, ct = int(rt) - 1, int(ct) - 1

    # 右、左、下、上
    direction = [(0, 1), (0, -1), (1, 0), (-1, 0)]
    dist = [[[-1] * 4 for _ in range(W)] for _ in range(H)]
    que = deque()
    for d, (dr, dc) in enumerate(direction):
        nr = rs + dr
        nc = cs + dc
        if 0 <= nr < H and 0 <= nc < W and grid[nr][nc] == ".":
            dist[nr][nc][d] = 0
            que.append((nr, nc, d))

    while que:
        r, c, prev_d = que.popleft()
        current_cost = dist[r][c][prev_d]

        for d, (dr, dc) in enumerate(direction):
            nr = r + dr
            nc = c + dc

            if not (0 <= nr < H and 0 <= nc < W) or grid[nr][nc] == "#":
                continue

            cost = 0 if prev_d == d else 1
            next_cost = current_cost + cost

            if dist[nr][nc][d] != -1 and dist[nr][nc][d] <= next_cost:
                continue

            dist[nr][nc][d] = next_cost

            if cost == 0:
                que.appendleft((nr, nc, d))
            else:
                que.append((nr, nc, d))

    answer = float('inf')
    for i in dist[rt][ct]:
        if i != -1:
            answer = min(answer , i)
    print(answer)


if __name__ == "__main__":
    solve()
