
# 鉄則問題集A54 Map
import sys


def solve():
    input_data = iter(sys.stdin.read().split())
    q = int(next(input_data))
    answer = []
    d = {}
    for _ in range(q):
        query = int(next(input_data))
        if query == 1:
            x, y = next(input_data), int(next(input_data))
            d[x] = y
        else:
            answer.append(d[next(input_data)])
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()