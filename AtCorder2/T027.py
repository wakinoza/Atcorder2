# 競プロの典型027
import sys


def solve():
    n, *s = sys.stdin.read().split()
    n = int(n)
    results = []
    registered_users = set()
    for i in range(n):
        if not s[i] in registered_users:
            results.append(i + 1)
            registered_users.add(s[i])
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()
