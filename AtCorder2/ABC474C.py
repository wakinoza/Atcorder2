# 鉄則問題集ABC474C
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, q = next(it), next(it)
    p = [next(it) for _ in range(n)]
    if n == 1:
        print(p[0])
        return
    p_dic = {p[0] : [None, p[1]]}
    for i in range(1, n - 1):
        p_dic[p[i]] = [p[i - 1], p[i + 1]]
    p_dic[p[n - 1]] = [p[n - 2], None]
    first_p = p[0]
    last_p = p[n - 1]
    for _ in range(q):
        a = next(it)
        if a == first_p:
            next_p = p_dic[a][1]
            p_dic[next_p][0] = None
            first_p = next_p
            p_dic[last_p][1] = a
            p_dic[a] = [last_p, None]
            last_p = a
        elif a == last_p:
            continue
        else:
            prev_p = p_dic[a][0]
            next_p = p_dic[a][1]
            p_dic[prev_p][1] = next_p
            p_dic[next_p][0] = prev_p
            p_dic[last_p][1] = a
            p_dic[a] = [last_p, None]
            last_p = a

    results = []
    results.append(first_p)
    for _ in range(n - 1):
        results.append(p_dic[results[-1]][1])
    print(" ".join(map(str, results)))


if __name__ == "__main__":
    solve()

