
# 鉄則問題集A57 ダブリンぐ
import sys

def solve():
    input_data = iter(map(int,sys.stdin.read().split()))
    n, q = next(input_data), next(input_data)
    a = [next(input_data) for _ in range(n)]
    dp = [[0] * 100009 for _ in range(32)]

    for i in range(1, n + 1):
        dp[0][i] = a[i- 1]
    for d in range(1, 30):
        for i in range(1, n + 1):
            dp[d][i] = dp[d - 1][dp[d - 1][i]]

    answer = []
    for _ in range(1, q + 1):
        x, y = next(input_data), next(input_data)
        current_place = x
        for d in range(29, -1, -1):
            if (y // (1 << d)) % 2 == 1:
                current_place = dp[d][current_place]
        answer.append(current_place)

    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()