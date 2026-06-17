# 鉄則問題集A21（区間DP）
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n = next(it)
    p = []
    a = []
    for _ in range(n):
        p.append(next(it) - 1)
        a.append(next(it))

    dp = [[0] * n for _ in range(n)]

    for LEN in range(n - 1, -1, -1):
        for l in range(n - LEN):
            r = l + LEN
            current_score = dp[l][r]

            if l + 1 <= r:
                score_l = a[l] if l <= p[l] <= r else 0
                if current_score + score_l > dp[l + 1][r]:
                    dp[l + 1][r] = current_score + score_l

            if l <= r - 1:
                score_r = a[r] if l <= p[r] <= r else 0
                if current_score + score_r > dp[l][r - 1]:
                    dp[l][r - 1] = current_score + score_r

    print(max(max(row) for row in dp))

if __name__ == "__main__":
    solve()