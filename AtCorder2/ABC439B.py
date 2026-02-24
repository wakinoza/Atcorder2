import sys

# sys.setrecursionlimit(10**7)

def get_sum_of_square(n):
    answer = sum(int(d) * int(d) for d in str(n))
    return answer

def solve():
    n = int(input())
    current_n = n
    for _ in range(10):
        next_n = get_sum_of_square(current_n)
        if next_n == 1:
            print("Yes")
            return
        else:
            current_n = next_n
    print("No")

if __name__ == "__main__":
    solve()