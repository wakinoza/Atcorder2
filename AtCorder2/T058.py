
# T058.py
import sys
from collections import deque


def solve():
    N, K = map(int, input().split())
    if N == 0:
        print(0)
        return
    MAX = 10 ** 5 - 1
    MOD = 10 ** 5
    next_num = []
    for i in range(MAX + 1):
        next_num.append((i + sum([int(c) for c in str(i)])) % MOD)
    checked_num_set = set()
    checked_num_list = []
    checked_num_index = [-1] * (MAX + 1)
    checked_num_set.add(N)
    checked_num_list.append(N)
    checked_num_index[N] = 0
    num = next_num[N]
    index = 0
    while not num in checked_num_set:
        index += 1
        checked_num_set.add(num)
        checked_num_list.append(num)
        checked_num_index[num] = index
        num = next_num[num]
    start_index = checked_num_index[num]
    orbital_period = index - start_index + 1
    if K < start_index:
        last_index = K
    else:
        last_index = start_index + (K - start_index) % orbital_period

    print(checked_num_list[last_index])

if __name__ == "__main__":
    solve()
