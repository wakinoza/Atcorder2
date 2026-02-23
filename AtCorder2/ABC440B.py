import sys

# sys.setrecursionlimit(10**7)

def solve():
    input_data = sys.stdin.read().split()
    n = int(input_data[0])
    t_list = list(map(int, input_data[1:]))
    index_list = [i for i in range(1, n + 1)]
    t_index_list = [(t,i) for t, i in zip(t_list, index_list)]
    t_index_list.sort(key=lambda x: x[0])
    print(t_index_list[0][1], t_index_list[1][1], t_index_list[2][1])

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

# input_data = sys.stdin.read().split()
# s = input_data[0]
# n = int(input_data[0])
# a_iterators = map(input_data[1:])
# a_iterators_int = map(int, input_data[1:])
# a_list = list(map(input_data[1:]))
# a_list_int = list(map(int, input_data[1:]))