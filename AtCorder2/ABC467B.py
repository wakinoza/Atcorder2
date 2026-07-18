#ABC466B（）
import sys

def solve():
    input_data = iter(sys.stdin.read().split())
    n = int(next(input_data))
    x_cash = 10000
    y_cash = 10000
    for _ in range(n):
        a, b, s = int(next(input_data)), int(next(input_data)), next(input_data)
        if s == "keep":
            x_cash -= b
        else:
            x_cash -= a
        y_cash -= a
    print(y_cash - x_cash)

if __name__ == "__main__":
    solve()


