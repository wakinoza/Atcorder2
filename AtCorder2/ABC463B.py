# ABC463B（）
import sys


def solve():
    input = iter(sys.stdin.read().split())
    n, x = int(next(input)),next(input)
    empty_count = [0] * 5
    seat_index = {"A": 0,"B": 1,"C": 2,"D": 3,"E": 4 }
    for _ in range(n):
        line = next(input)
        for i in range(5):
            if line[i] == "o":
                empty_count[i] += 1
    empty_total = empty_count[seat_index[x]]            
    print("Yes" if empty_total >= 1 else "No")


if __name__ == "__main__":
    solve()

