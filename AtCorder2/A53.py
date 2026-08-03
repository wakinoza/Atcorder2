# 鉄則問題集A53 優先度キュー
import sys
import heapq

def solve():
    input_data = iter(sys.stdin.read().split())
    q = int(next(input_data))
    answer = []
    priority_queue = []
    for _ in range(q):
        query = int(next(input_data))
        if query == 1:
            heapq.heappush(priority_queue, int(next(input_data)))
        elif query == 2:
            if priority_queue:
                answer.append(priority_queue[0])
        else:
            heapq.heappop(priority_queue)
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()