# T064
import sys

def solve():
    it = map(int, sys.stdin.read().split())
    N, Q = next(it), next(it)
    A = [next(it) for _ in range(N)]
    uplift_list = [(A[i] - A[i - 1]) for i in range(1, N)]
    uplift_total = sum([abs(upLift) for upLift in uplift_list])
    results = []
    for _ in range(Q):
        L, R, V = next(it) - 2, next(it) - 1, next(it)
        if R <= N - 2:
            uplift_total += abs(uplift_list[R] - V) - abs(uplift_list[R])
            uplift_list[R] -= V
        if L >= 1:
            uplift_total += abs(uplift_list[L] + V) - abs(uplift_list[L])
            uplift_list[L] += V
        results.append(uplift_total)
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()