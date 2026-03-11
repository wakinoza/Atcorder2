# ABC433B
import sys

# sys.setrecursionlimit(10**7)

def solve():
    N, *A = map(int, sys.stdin.read().split())
    results = []
    for i in range(N):
        if i == 0:
            results.append(-1)
        else:
            has_toller = False
            for j in reversed([x for x in range(i)]):
                if A[i] < A[j] :
                    results.append(j + 1)
                    has_toller = True
                    break
            if not has_toller:
                results.append(-1)
    print('\n'.join(map(str, results)))

if __name__ == "__main__":
    solve()


# s = input()
# n = int(input())
# n, m = map(int, input().split()) #入力を空白区切りで分割し、整数に変換
# f = float(input())
# s2, s2, s3 = input().rstrip() #1行文字列を空白区切りで文字列に分割する
# l = list(map(int, input().split()))

# input = sys.stdin.read().split()
# it = iter(input)

# # 変数N, M, S, T, Qが受け渡されrる。利用しない変数N, M,Q は _ で受ける。
# イテレータにすると，インデクスなしでNextで受け取れる
# _, _, S, T, _ = next(it), next(it), next(it), next(it), next(it)

# 最初のデータを捨てて、残りのデータをリストｔに格納
# _, *t = map(int, sys.stdin.read().split())

# input_data = sys.stdin.read().split()
# s = input_data[0]
# n = int(input_data[0])

# a_iterators = map(input_data[1:])
# a_iterators_int = map(int, input_data[1:])

# a_list = list(map(input_data[1:]))
# a_list_int = list(map(int, input_data[1:]))