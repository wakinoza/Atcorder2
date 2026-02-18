# ABC443B

n, k = map(int, input().split())
add_year = 0
total = n
while total < k :
  add_year += 1
  total += add_year + n
print(add_year)