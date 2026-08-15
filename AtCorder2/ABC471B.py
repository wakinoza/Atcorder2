# ABC471B
import sys


def solve():
    input = sys.stdin.read().split()
    n = int(input[0])
    s = [input[i].lower() for i in range(1,n + 1)]
    answer = max([s.count(string) for string in s])
    print(answer)

if __name__ == "__main__":
    solve()
