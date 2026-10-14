#T076
import sys


def solve():
    N, *A = map(int, sys.stdin.read().split())
    A2 = A + A
    sum_A = sum(A)
    if sum_A % 10 != 0:
        print("No")
        return
    target = sum_A // 10
    answer = "No"
    need_check = True
    for i in range(N):
        current_sum = 0
        current_index = i
        while current_sum < target:
            current_sum += A2[current_index]
            if current_sum == target:
                answer = "Yes"
                need_check = False
                break
            current_index += 1
        if not need_check:
            break
    print(answer)

if __name__ == "__main__":
    solve()

