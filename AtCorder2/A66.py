# 鉄則問題集A66（Union-Find木）
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, q = next(it), next(it)
    parent = [-1] * (n + 1)
    size = [1] * (n + 1)
    results = []
    for i in range(q):
        query, u, v = next(it), next(it), next(it)
        if query == 1:
            unite(u, v, parent, size)
        else:
            if get_root(u, parent) == get_root(v, parent):
                results.append("Yes")
            else:
                results.append("No")

    print("\n".join(results))

def get_root(x, parent):
    while(True) :
        if parent[x] == -1:
            break
        else:
            x = parent[x]
    return x

def unite(u, v, parent, size):
    root_u, root_v = get_root(u, parent), get_root(v, parent)
    if root_u == root_v :
        return
    if size[root_u] < size[root_v]:
        parent[root_u] = root_v
        size[root_v] += size[root_u]
    else:
        parent[root_v] = root_u
        size[root_u] += size[root_v]


if __name__ == "__main__":
    solve()
