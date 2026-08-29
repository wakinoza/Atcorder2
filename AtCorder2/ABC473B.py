# ABC473B
import sys

def solve():
    n, *a = map(int, sys.stdin.read().split())
    current_total = sum(a)
    set_a = set(a)
    for num in set_a:
        count = a.count(num)
        mod = count % 2
        if count > mod:
            current_total -= num * (count - mod)
    print(current_total)

if __name__ == "__main__":
    solve()

