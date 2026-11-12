# T042.py

def solve():
    K = int(input())
    MOD = 10 ** 9 + 7
    if K % 9 != 0:
        print(0)
        return
    dp = [0] * (K + 1)
    dp[0] = 0
    dp[1] = 1
    for i in range(2 ,K + 1):
        sum = 0
        if i <= 9:
            sum += 1
        for j in range(1, 10):
            prev = i - j
            if prev >= 0:
                sum += dp[prev]
        dp[i] = (sum % MOD)
    print(dp[K])



if __name__ == "__main__":
    solve()