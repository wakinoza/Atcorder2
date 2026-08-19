# 鉄則問題集A60（スタック）
import sys

def solve():
    n, *a = map(int, sys.stdin.read().split())
    a_list = [0] + a
    stack = []
    results = []
    for i in range(1, n + 1):
        if i >= 2:
            stack.append((i - 1, a_list[i - 1]))
            while stack:
                prev_a = stack[-1][1]
                if prev_a <= a_list[i]:
                    stack.pop()
                else:
                    break
        if stack:
            results.append(stack[-1][0])
        else:
            results.append(-1)

    print(" ".join(map(str, results)))

if __name__ == "__main__":
    solve()
