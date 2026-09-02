# 競プロ典型010
import sys

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n = next(it)
    class1_sum = [0] * (n + 1)
    class2_sum = [0] * (n + 1)
    for i in range(1, n +  1):
        c, p = next(it), next(it)
        if c == 1:
            class1_sum[i] = class1_sum[i - 1] + p
            class2_sum[i] = class2_sum[i - 1]
        else:
            class1_sum[i] = class1_sum[i - 1]
            class2_sum[i] = class2_sum[i - 1] + p

    q = next(it)
    answer = []
    for _ in range(q):
        l, r = next(it), next(it)
        current_class1_sum = class1_sum[r] - class1_sum[l - 1]
        current_class2_sum = class2_sum[r] - class2_sum[l - 1]
        answer.append(str(current_class1_sum) + " " + str(current_class2_sum))
    print("\n".join(answer))

if __name__ == "__main__":
    solve()

