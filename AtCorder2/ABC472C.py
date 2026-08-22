# ABC472C（）
import sys

def solve():
    n, m, k, *a = map(int, sys.stdin.read().split())
    results = []
    k_total = 0
    eaten = [False] * (n)
    for i in range(n):
        passed = i - m
        if passed >= 0 and eaten[passed]:
            k_total -= a[passed]

        if k_total + a[i] <= k:
            k_total += a[i]
            eaten[i] = True
            results.append("Yes")
        else:
            results.append("No")
    print("\n".join(results))

if __name__ == "__main__":
    solve()

