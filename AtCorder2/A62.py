# 鉄則問題集A62（深さ優先選択）
import sys
sys.setrecursionlimit(200000)

def dfs(position, visited, graf):
    visited[position] = True
    for i in range(len(graf[position])):
        next = graf[position][i]
        if not visited[next] :
            dfs(next, visited, graf)
    return

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, m = next(it), next(it)
    graf = [[] for i in range(n + 1)]
    for _ in range(m):
        a, b = next(it), next(it)
        graf[a].append(b)
        graf[b].append(a)
    visited = [False] * (n + 1)

    dfs(1, visited, graf)
    for i in range(1,n + 1) :
        if not visited[i]:
            print("The graph is not connected.")
            return
    print("The graph is connected.")


if __name__ == "__main__":
    solve()

