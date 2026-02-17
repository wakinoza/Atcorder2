# ABC444B
# import sys
# sys.setrecursionlimit(10**7)
# input = sys.stdin.readline

n, k = map(int, input().split())
k_total = 0
for i in range(1,n + 1):
  digit_sum = 0
  current_i = i
  while current_i > 0 :
    digit_sum += current_i % 10
    current_i = current_i // 10

  if digit_sum == k:
    k_total += 1

print(k_total)
