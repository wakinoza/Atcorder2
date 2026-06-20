# ABC463A
import sys



def solve():
    x, y = map(int, input().split())
    print("Yes" if x * 9 == y * 16  else "No")

if __name__ == "__main__":
    solve()

