# 鉄則問題集A44 データの持ち方を工夫する
import sys

def solve():
    input_data = map(int,sys.stdin.read().split())
    n, q = next(input_data), next(input_data)
    answer = []
    array =  [x for x in range(n + 1)]
    is_reversed = False
    for _ in range(q):
        query_type = next(input_data)
        if query_type == 1:
            x, y = next(input_data),next(input_data)
            idx = (n - x + 1) if is_reversed else x
            array[idx] = y
        elif query_type == 2:
            is_reversed = not is_reversed
        else :
            x = next(input_data)
            idx = (n - x + 1) if is_reversed else x
            answer.append(array[idx])
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()