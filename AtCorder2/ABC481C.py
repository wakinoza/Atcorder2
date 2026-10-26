# ABC481C

import sys

def solve():
    it = iter(sys.stdin.read().split())
    Q = int(next(it))
    is_used_num = [False] * (Q + 1)
    min_index = 1
    accounts = {}
    results = []
    for _ in range(Q):
        s = next(it)
        if s in accounts:
            results.append(accounts[s])
        else:
            current_index = min_index
            while is_used_num[current_index]:
                current_index += 1
            accounts[s] = current_index
            is_used_num[current_index] = True
            min_index = current_index + 1
            results.append(current_index)
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()
