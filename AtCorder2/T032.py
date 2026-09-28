# T032
import sys
from itertools import permutations

def solve():
    it = map(int, sys.stdin.read().split())
    N = next(it)
    A =  [[] for _ in range(N)]
    for i in range(N):
        for _ in range(N):
            A[i].append(next(it))

    M = next(it)
    can_not_handover = [[] for _ in range(N)]
    for _ in range(M):
        X, Y = next(it) - 1, next(it) - 1
        can_not_handover[X].append(Y)
        can_not_handover[Y].append(X)

    run_permutations = list(permutations([x for x in range(N)]))
    answer = float('inf')

    for permutation in run_permutations:
        total = 0
        for index, runner in enumerate(permutation):
            total += A[runner][index]
            if index <= N - 2 and permutation[index + 1] in can_not_handover[runner]:
                total = float('inf')
                break
        answer = min(total, answer)

    print(-1 if answer == float('inf')  else answer)


if __name__ == "__main__":
    solve()
