import sys
from collections import deque


# sys.setrecursionlimit(10**7)

def solve():
    input_data = sys.stdin.read().split()
    a_stack = []
    prev_a = input_data[1]
    count = 1
    for a in input_data[2:]:
        if (a == prev_a):
            count += 1
        else:
            while len(a_stack) != 0:
                stack_a, stack_count = a_stack[-1]
                if prev_a == stack_a:
                    a_stack.pop()
                    count += stack_count
                else:
                    break
            count %= 4
            if count >= 1:
                a_stack.append([prev_a, count])
            prev_a = a
            count = 1
    while len(a_stack) != 0:
        stack_a, stack_count = a_stack[-1]
        if prev_a == stack_a:
            a_stack.pop()
            count += stack_count
        else:
            break
    count %= 4
    if count >= 1:
        a_stack.append([prev_a, count])
    answer = sum(count for a , count in a_stack)
    print(answer)

if __name__ == "__main__":
    solve()