# 鉄則問題集A51 スタック
import sys

def solve():
    input_data = iter(sys.stdin.read().split())
    q = int(next(input_data))
    answer = []
    stack = []
    for _ in range(q):
        query = int(next(input_data))
        if query == 1:
            stack.append(next(input_data))
        elif query == 2:
            if stack:
                answer.append(stack[-1])
        else:
            stack.pop()
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()