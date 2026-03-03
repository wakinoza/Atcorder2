
# ABC435B
import sys
import itertools

# sys.setrecursionlimit(10**7)

def solve():
    N, *A = map(int, sys.stdin.read().split())
    accumulate_A = list(itertools.accumulate(A))
    answer = 0
    for i in range(N):
        for j in range(i,N):
            current_sum = 0
            if i == 0 :
                current_sum = accumulate_A[j]
            else:
                current_sum = accumulate_A[j] - accumulate_A[i - 1]
            has_divisor = False
            for x in range(i, j + 1):
                if current_sum % A[x] == 0:
                    has_divisor = True
                    break
            if not has_divisor :
                answer += 1
    print(answer)

if __name__ == "__main__":
    solve()

