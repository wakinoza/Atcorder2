# 鉄則問題集A61（グラフ）
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, m = next(it), next(it)
    graf = [[] for i in range(n + 1)]
    for _ in range(m):
        a, b = next(it), next(it)
        graf[a].append(b)
        graf[b].append(a)
    for i in range(1, n + 1):
        l = graf[i]
        l_sorted = sorted(l)
        answer = str(i) + ": {" + ", ".join(map(str, l_sorted)) + "}"
        print(answer)

if __name__ == "__main__":
    solve()

