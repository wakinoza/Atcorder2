# ABC476A
import sys



def solve():
    s = input()
    answer = ""
    if s[-1] == 'e':
        answer = s + "r"
    else :
        answer = s + "er"
    print(answer)

if __name__ == "__main__":
    solve()

