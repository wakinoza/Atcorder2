# ABC482C
import sys
from collections import Counter
from bisect import bisect_left, bisect_right

def solve():
    it = map(int, sys.stdin.read().split())
    _, _, N, Q = next(it), next(it), next(it), next(it)
    h_line = []
    w_line = []
    for _ in range(N):
        r, c = next(it), next(it)
        h_line.append(r)
        w_line.append(c)
    h_count_hashmap = Counter(h_line)
    h_count_hashmap_list = [(num, count) for num, count in h_count_hashmap.items()]
    h_count_hashmap_list.sort(key=lambda x: x[0])
    h_num_list = []
    h_cumsum_list = []
    total = 0
    for num, count in h_count_hashmap_list:
        total += count
        h_num_list.append(num)
        h_cumsum_list.append(total)
    h_num_list = [0] + h_num_list
    h_cumsum_list = [0] + h_cumsum_list

    w_count_hashmap = Counter(w_line)
    w_count_hashmap_list = [(num, count) for num, count in w_count_hashmap.items()]
    w_count_hashmap_list.sort(key=lambda x: x[0])
    w_num_list = []
    w_cumsum_list = []
    total = 0
    for num, count in w_count_hashmap_list:
        total += count
        w_num_list.append(num)
        w_cumsum_list.append(total)
    w_num_list = [0] + w_num_list
    w_cumsum_list = [0] + w_cumsum_list

    results = []
    for _ in range(Q):
        query = next(it)
        if query == 1:
            u, d = next(it), next(it)
            right_index = bisect_right(h_num_list, d) - 1
            left_index = bisect_left(h_num_list, u) - 1
            results.append(h_cumsum_list[right_index] - h_cumsum_list[left_index])
        else:
            l, r = next(it), next(it)
            right_index = bisect_right(w_num_list, r) - 1
            left_index = bisect_left(w_num_list, l) - 1
            results.append(w_cumsum_list[right_index] - w_cumsum_list[left_index])
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()

