# ABC471C
import sys


def solve():
    n, *a = map(int, sys.stdin.read().split())
    a_sorted = sorted(a)
    a_sorted_minus = [num for num in a_sorted if num < 0]
    a_reverse_minus = sorted(a_sorted_minus, reverse=True)
    a_sorted_plus = [num for num in a_sorted if num > 0]
    answer = 0
    minus_index = 0
    plus_index = 0
    prev_position = 0
    for _ in range(n):
        if minus_index >= len(a_reverse_minus):
            answer += a_sorted_plus[plus_index] - prev_position
            prev_position = a_sorted_plus[plus_index]
            plus_index += 1
        elif plus_index >= len(a_sorted_plus):
            answer += prev_position - a_reverse_minus[minus_index]
            prev_position = a_reverse_minus[minus_index]
            minus_index += 1
        else:
            minus_dis = prev_position - a_reverse_minus[minus_index]
            plus_dis = a_sorted_plus[plus_index] - prev_position
            if minus_dis <= plus_dis:
                answer += minus_dis
                prev_position = a_reverse_minus[minus_index]
                minus_index += 1
            else:
                answer += plus_dis
                prev_position = a_sorted_plus[plus_index]
                plus_index += 1
    print(answer)

if __name__ == "__main__":
    solve()

