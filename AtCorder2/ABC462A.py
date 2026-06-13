# ABC462A
import sys

def solve():
    s = input()
    answer = []
    for char in s:
        asc = ord(char)
        if  48 <= asc <= 57:
            answer.append(char)
    print("".join(answer))

if __name__ == "__main__":
    solve()
