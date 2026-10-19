# ABC480B
import sys

def solve():
    it = iter(sys.stdin.read().split())
    N, M = int(next(it)), int(next(it))
    S = [next(it) for _ in range(N)]
    S_set = set(S)
    vote_results =[0] * N
    for _ in range(M):
        t = next(it)
        if t in S_set:
            vote_results[S.index(t)] += 1
            continue
        candidate_total = 0
        candidate_name = ""
        t_len = len(t)
        for name in S:
            if len(name) == t_len:
                diff_count = 0
                for i in range(t_len):
                    if t[i] != name[i]:
                        diff_count += 1
                if diff_count == 1:
                    candidate_total += 1
                    candidate_name = name
        if candidate_total == 1:
            vote_results[S.index(candidate_name)] += 1
    print("\n".join(map(str, vote_results)))

if __name__ == "__main__":
    solve()

