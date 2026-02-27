import sys

# sys.setrecursionlimit(10**7)

def solve():
    it = iter(sys.stdin.read().split())
    N, M = int(next(it)),int(next(it))
    block_set = set()
    answer = 0
    for _ in range(M):
        r, c = next(it),next(it)
        r_int, c_int = int(r), int(c)
        rc = r + "-" + c
        r1c = str(r_int + 1) + "-" + c
        rc1 = r + "-" + str(c_int + 1)
        r1c1 = str(r_int + 1) + "-" + str(c_int + 1)
        if rc not in block_set and r1c not in block_set and rc1 not in block_set and r1c1 not in block_set:
            answer += 1
            block_set.add(rc)
            block_set.add(r1c)
            block_set.add(rc1)
            block_set.add(r1c1)
    print(answer)

if __name__ == "__main__":
    solve()

