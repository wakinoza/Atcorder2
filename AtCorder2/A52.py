# 鉄則問題集A52 キュー
import sys
from collections import deque

def solve():
    input_data = iter(sys.stdin.read().split())
    q = int(next(input_data))
    answer = []
    query_deque = deque()
    for _ in range(q):
        query = int(next(input_data))
        if query == 1:
            query_deque.append(next(input_data))
        elif query == 2:
            if query_deque:
                answer.append(query_deque[0])
        else:
            query_deque.popleft()
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()