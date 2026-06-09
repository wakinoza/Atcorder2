# 鉄則問題集A17（DP）
import sys

def solve():
    n, *other = map(int, sys.stdin.read().split())
    a, b = other[:n - 1], other[n - 1:]
    dp = [0] * (n + 1)
    dp[1] = 0
    dp[2] = a[0]
    for i in range(3, n + 1):
        dp[i] = min(dp[i - 1] + a[i - 2], dp[i - 2] + b[i - 3])
    
    answer = [n]
    index = n
    while index > 2:
        if dp[index] == dp[index - 1] + a[index - 2] :
            index -= 1
        else :
            index -= 2
        answer.append(index)
    if index == 2:
        answer.append(1)
    
    print(len(answer))
    answer.reverse()
    print(*answer)


if __name__ == "__main__":
    solve()