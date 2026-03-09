# ABC434B
import sys

# sys.setrecursionlimit(10**7)

def solve():
    it = iter(map(int,sys.stdin.read().split()))
    N, M = next(it), next(it)
    bird_sum_count_list = [[0] * 2 for x in range(M)]
    for _ in range(N):
        A, B = next(it) - 1, next(it)
        bird_sum_count_list[A][0] += B
        bird_sum_count_list[A][1] += 1
    results = []
    for i in range(M):
        results.append(bird_sum_count_list[i][0] / bird_sum_count_list[i][1])
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