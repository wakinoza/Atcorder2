# ABC432B
import sys

# sys.setrecursionlimit(10**7)

def solve():
    X = list(input())
    X_sorted= sorted(X)
    count_0 = 0
    without_0 = []
    for x in X_sorted :
        if x == "0":
            count_0 += 1
        else :
            without_0.append(x)
    if count_0 > 0 :
        answer = without_0.insert(1, "0" * count_0)
    print("".join(without_0))

if __name__ == "__main__":
    solve()

