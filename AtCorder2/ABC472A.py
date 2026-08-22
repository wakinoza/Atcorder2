# ABC472A（）
import sys



def solve():
    s = input()
    results = []
    for letter in s:
        if letter == "A":
            results.append("A")
        else:
            results.append(".")

    print("".join(results))

if __name__ == "__main__":
    solve()

