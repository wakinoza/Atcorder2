# T026.py
import sys


def solve():
    it = map(int, sys.stdin.read().split())
    N = next(it)
    Graf = [[] for _ in range(N + 1)]
    for _ in range(N - 1):
        A, B = next(it), next(it)
        Graf[B].append(A)
        Graf[A].append(B)
    groups_plus = []
    groups_minus = []
    checked = [0] * (N + 1)
    stack = []
    stack.append(1)
    checked[1] = 1
    groups_plus.append(1)
    while len(stack) >= 1:
        pop = stack.pop()
        prev = checked[pop]
        for point in Graf[pop]:
            if checked[point] == 0:
                current = prev * (-1)
                stack.append(point)
                checked[point] = current
                if current > 0:
                    groups_plus.append(point)
                else:
                    groups_minus.append(point)
    answer_group = []
    if len(groups_plus) >= len(groups_minus):
        answer_group = groups_plus
    else:
        answer_group = groups_minus
    answer_group.sort()
    print(" ".join(map(str, answer_group[:(N // 2)])))

if __name__ == "__main__":
    solve()
