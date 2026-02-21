import sys

input_data = sys.stdin.read().split()
n = int(input_data[0])
m = int(input_data[1])
takahashi_chars = set(input_data[2])
aoki_chars = set(input_data[3])
q = int(input_data[4])
w_iterators  = input_data[5:]
results = []
for word in w_iterators:
  word_chars = set(word)
  use_takahashi_chars = (set(word_chars) <= set(takahashi_chars))
  use_aoki_chars = (set(word_chars) <= set(aoki_chars))
  if use_takahashi_chars and not use_aoki_chars:
    results.append("Takahashi")
  elif not use_takahashi_chars and use_aoki_chars:
    results.append("Aoki")
  else:
    results.append("Unknown")
print('\n'.join(results))


    
# s = input()
# n = int(input())
# n, m = map(int, input().split()) #入力を空白区切りで分割し、整数に変換
# f = float(input())
# s2, s2, s3 = input().rstrip() #1行文字列を空白区切りで文字列に分割する
# l = list(map(int, input().split()))



# input_data = sys.stdin.read().split()
# s = input_data[0]
# n = int(input_data[0])
# a_iterators = input_data[1:]
# a_iterators_int = map(int, input_data[1:])
# a_list = list(input_data[1:])
# a_list_int = list(map(int, input_data[1:]))