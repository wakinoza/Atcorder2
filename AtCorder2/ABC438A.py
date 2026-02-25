
def solve():
    WEEK = 7
    d, f = map(int, input().split())
    answer = WEEK - ((d - f) % WEEK)
    if answer == 0:
        answer = 7

    print(answer)

if __name__ == "__main__":
    solve()