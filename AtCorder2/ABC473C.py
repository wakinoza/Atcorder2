# ABC473C
import sys


def solve():
    _, k, *a = map(int, sys.stdin.read().split())
    class_count = [0] * k
    for current_class in  a:
        class_count[current_class - 1] += 1
    max_count = max(class_count)
    answer = class_count.count(max_count) + class_count.count(max_count - 1)
    print(answer)

if __name__ == "__main__":
    solve()

