# ABC476B
import sys


def solve():
    _ , S , T = sys.stdin.read().split()
    answer = "Yes"
    for s_char, t_char in zip(S, T):
        if t_char == "*" or s_char == t_char:
            continue
        else:
            answer = "No"
            break

    print(answer)

if __name__ == "__main__":
    solve()

