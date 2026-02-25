import sys

# sys.setrecursionlimit(10**7)

def solve():
    line1 = sys.stdin.readline().split()
    N, M = map(int, line1)
    S = sys.stdin.readline().strip()
    T = sys.stdin.readline().strip()
    min_total = sys.maxsize
    for i in range(N - M + 1):
        current_total = 0
        for j in range(M):
            diff = int(S[i + j]) -int(T[j])
            if (diff < 0):
                diff += 10
            current_total += diff
        min_total = min(min_total, current_total)
    print(min_total)

if __name__ == "__main__":
    solve()

