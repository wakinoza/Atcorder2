# ABC476C
import sys
from bisect import bisect_right
from itertools import accumulate

def solve():
    it = map(int, sys.stdin.read().split())
    N, M, K, X, Y = next(it),next(it),next(it),next(it),next(it)

    if X == 0 and Y == 0:
        print(0)
        return

    A = [next(it) for _ in range(N)]
    A_sorted = sorted(A)
    B = [next(it) for _ in range(M)]
    B_sorted = sorted(B)
    B_kbills = [(b - 1) // K + 1 for b in B_sorted]

    prefA = [0] + list(accumulate(A_sorted))
    prefB = [0] + list(accumulate(B_sorted))
    pref_kbills = [0] + list(accumulate(B_kbills))

    answer = 0

    for c in range(M + 1):
        k = pref_kbills[c]
        if k > Y:
            break

        cost_B = prefB[c]
        change = k * K - cost_B
        rem_money = X + (Y - k) * K + change
        a_cnt = bisect_right(prefA, rem_money) - 1
        answer = max(answer, c + a_cnt)

    print(answer)


if __name__ == "__main__":
    solve()

