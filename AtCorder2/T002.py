# 典型T002
import sys

def is_good_parentheses(s):
    stack = []
    for letter in s:
        if letter == '(':
            stack.append(letter)
        else:
            if not stack:
                return False
            pop = stack.pop()
            if pop == ')':
                return False
    return True

def solve():
    n = int(input())
    if n % 2 == 1:
        return

    results = []
    for num in range(1, 2 ** n + 1):
        bin_num = format(num, 'b').zfill(n)
        if bin_num.count('1') != n // 2:
            continue

        parentheses_list = []
        for letter in bin_num:
            if letter == '1':
                parentheses_list.append(")")
            else:
                parentheses_list.append("(")
        current_parentheses = "".join(map(str, parentheses_list))

        if is_good_parentheses(current_parentheses):
            results.append(current_parentheses)

    results_sorted = sorted(results)
    print("\n".join(map(str, results_sorted)))

if __name__ == "__main__":
    solve()