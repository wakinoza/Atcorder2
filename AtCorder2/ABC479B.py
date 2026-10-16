# ABC479B
import sys

def solve():
    n = int(input())
    s = input()
    answer = 0
    current_rain_period = 0
    for today in s:
        if today == "R":
            current_rain_period += 1
        else:
            answer = max(answer, current_rain_period)
            current_rain_period = 0
    answer = max(answer, current_rain_period)
    print(answer)

if __name__ == "__main__":
    solve()

