import sys

# sys.setrecursionlimit(10**7)

def solve():
    n = int(input())
    num_list = [[0] * n for i in range(n)]
    r = 0
    c = (n - 1) // 2
    num_list[r][c] = 1
    for k in range(2, n ** 2 + 1):
        if r == 0:
            r += n
        next_r = (r - 1) % n
        next_c = (c + 1) % n
        if num_list[next_r][next_c] == 0:
            num_list[next_r][next_c] = k
            r = next_r
            c = next_c
        else :
            next_r = (r + 1) % n
            num_list[next_r][c] = k
            r = next_r

    for x in range(n):
        print(*num_list[x])

if __name__ == "__main__":
    solve()