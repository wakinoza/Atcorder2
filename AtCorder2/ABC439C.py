import sys
import math

# sys.setrecursionlimit(10**7)

def solve():
    n = int(input())
    root_n = math.isqrt(n)
    combination_dic = {}
    for i in range(1, root_n) :
        for j in range(i + 1, root_n + 1):
            current_sum = i * i + j * j
            if (current_sum > n):
                continue
            if current_sum in combination_dic:
                combination_dic[current_sum] += 1
            else:
                combination_dic[current_sum] = 1
    answer_list = [key for key, val in combination_dic.items() if val == 1]
    print(len(answer_list))
    answer_list.sort()
    print(*answer_list)

if __name__ == "__main__":
    solve()