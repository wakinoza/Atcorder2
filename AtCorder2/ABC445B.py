
n = int(input())
s_list = []
max_a_length = 0

for  i in range(n):
  s = input()
  s_list.append(s)
  if len(s) > max_a_length:
    max_a_length = len(s)

for current_s in s_list:
  current_s_length = len(current_s)

  if current_s_length == max_a_length:
    print(current_s)
  else:
    dot_number = (max_a_length - current_s_length) // 2
    dot = "." * dot_number
    print(dot + current_s + dot)

