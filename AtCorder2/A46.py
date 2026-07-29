# 鉄則問題集A46 貪欲法
import sys
import math

def solve():
    input_data = map(int,sys.stdin.read().split())
    n = next(input_data)
    towns = [(next(input_data),next(input_data)) for _ in range(n)]
    answer = [1]
    checked = [True] + [False for _ in  range(n - 1)]
    prev_x = towns[0][0]
    prev_y = towns[0][1]
    for _ in range(n - 1) :
        min_distance = 1000_000
        nearest_index = 0
        for i, check in enumerate(checked):
            if check :
                continue

            x, y = towns[i]
            current_distance = math.isqrt(pow((prev_x - x), 2) + pow((prev_y - y), 2))
            if min_distance > current_distance:
                nearest_index = i
                min_distance = current_distance

        answer.append(nearest_index + 1)
        prev_x = towns[nearest_index][0]
        prev_y = towns[nearest_index][1]
        checked[nearest_index] = True

    answer.append(1)
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()