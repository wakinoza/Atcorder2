import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    H, W, N = next(it), next(it), next(it)

    a_row_list = [-1] * 91
    for i in range(H):
        for _ in range(W):
            a_row_list[next(it)] = i

    row_count_list = [0] * H
    for _ in range(N):
        current_row = a_row_list[next(it)]
        if current_row >= 0:
            row_count_list[current_row] += 1

    print(max(row_count_list,default=0))

if __name__ == "__main__":
    solve()