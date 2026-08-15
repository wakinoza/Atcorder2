# ABC471D
import sys
import heapq


def solve():
    it = iter(map(int, sys.stdin.read().split()))
    q, v = next(it), next(it)
    results = []
    h = []
    prev_t = 0
    for _ in range(q):
        query = next(it)
        if query == 1:
            t, w = next(it), next(it)

            heapq.heappush(h, t - w)
            prev_t = t
        else:
            t = next(it)
            if len(h) > 0:
                max_val = -heapq.heappop(h)
                results.append(min(max_val + t,v))
            else :
                results.append(-1)
            prev_t = t
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()

