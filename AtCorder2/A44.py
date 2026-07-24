# 鉄則問題集A44 データの持ち方を工夫する
import sys

def solve():
    input_data = iter(map(int,sys.stdin.read().split()))
    n, q = next(input_data), next(input_data),
    answer = []
    array =  [0] + [x for x in range(1,n + 1)]
    is_reverse = False
    for _ in range(q):
        q = next(input_data)
        if q == 1:
            x, y = next(input_data),next(input_data)
            if is_reverse :
                array[n - x + 1] = y
            else :
                array[x] = y
        elif q == 2 :
            is_reverse = not is_reverse
        else :
            x = next(input_data)
            if is_reverse :
                answer.append(array[n - x + 1])
            else :
                answer.append(array[x])
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()