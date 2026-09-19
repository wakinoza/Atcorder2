# ABC476C
import sys

def solve():
    _, *A = map(int, sys.stdin.read().split())
    check_list_sorted = sorted([A[0], A[1], A[2]], reverse=True)
    first = check_list_sorted[0]
    second = check_list_sorted[1]
    third = check_list_sorted[2]
    results = []
    results.append(third)
    for i in A[3:]:
        if second > i >= third:
            third = i
        elif first > i >= second:
            third = second
            second = i
        elif i >= first:
            third = second
            second = first
            first = i
        results.append(third)
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()

