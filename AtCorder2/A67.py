# 鉄則問題集A67（最小全域木）
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, m = next(it), next(it)
    parent = [-1] * (n + 1)
    dis = [1] * (n + 1)
    a_list, b_list, c_list = [0] * m, [0] * m,[0] * m
    edge_list = []

    for i in range(m):
        a, b, c = next(it), next(it), next(it)
        a_list[i], b_list[i], c_list[i] = a, b, c
        edge_list.append((c, i))

    edge_list.sort(key=lambda x: x[0])
    answer= 0
    for i in range(m):
        index = edge_list[i][1]
        if not is_same(a_list[index], b_list[index], parent):
            unite(a_list[index], b_list[index], parent, dis)
            answer += c_list[index]
    print(answer)

def get_root(x, parent):
    while(True) :
        if parent[x] == -1:
            break
        else:
            x = parent[x]
    return x

def unite(u, v, parent, dis):
    root_u, root_v = get_root(u, parent), get_root(v, parent)
    if root_u == root_v :
        return
    if dis[root_u] < dis[root_v]:
        parent[root_u] = root_v
        dis[root_v] += dis[root_u]
    else:
        parent[root_v] = root_u
        dis[root_u] += dis[root_v]

def is_same(u, v, parent):
    if get_root(u, parent) == get_root(v, parent):
        return True
    else:
        return False

if __name__ == "__main__":
    solve()
