import sys

def solve():
    # 入力を一気に読み込み、イテレータにする
    input_data = map(int, sys.stdin.read().split())
    T = next(input_data)
    results = []
    for _ in range(T):
        N = next(input_data)
        W = next(input_data)
        C = [next(input_data) for _ in range(N)]
        W2 = 2 * W

        surplus_costs = [0] * W2
        for i, cost in enumerate(C, 1):
            surplus_costs[i % W2] += cost

        extended_costs = surplus_costs + surplus_costs

        current_sum = sum(extended_costs[:W])
        min_cost = current_sum
        for i in range(W2):
            current_sum = current_sum - extended_costs[i] + extended_costs[i + W]
            if current_sum < min_cost:
                min_cost = current_sum
        results.append(str(min_cost))

    sys.stdout.write("\n".join(results) + "\n")

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