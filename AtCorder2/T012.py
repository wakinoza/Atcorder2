# T012.py
import sys


import sys


def solve():
    it = iter(map(int, sys.stdin.buffer.read().split()))
    H, W, Q = next(it), next(it), next(it)
    parent = {}
    size = {}

    def find_root(x):
        while parent[x] != x:
            parent[x] = parent[parent[x]]
            x = parent[x]
        return x

    def union(a, b):
        root_a = find_root(a)
        root_b = find_root(b)
        if root_a == root_b:
            return
        if size[root_a] < size[root_b]:
            root_a, root_b = root_b, root_a
        parent[root_b] = root_a
        size[root_a] += size[root_b]

    results = []
    directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

    for _ in range(Q):
        t = next(it)
        if t == 1:
            r = next(it) - 1
            c = next(it) - 1
            cell = (r, c)

            if cell in parent:
                continue

            parent[cell] = cell
            size[cell] = 1

            for dr, dc in directions:
                nr = r + dr
                nc = c + dc
                if 0 <= nr < H and 0 <= nc < W:
                    neighbor = (nr, nc)
                    if neighbor in parent:
                        union(cell, neighbor)

        else:
            ra, ca, rb, cb  = next(it) - 1, next(it) - 1,  next(it) - 1,next(it) - 1
            a = (ra, ca)
            b = (rb, cb)

            if (
                a in parent
                and b in parent
                and find_root(a) == find_root(b)
            ):
                results.append("Yes")
            else:
                results.append("No")

    print("\n".join(results))


if __name__ == "__main__":
    solve()
