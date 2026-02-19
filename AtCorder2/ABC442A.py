# ABC
# import sys
# sys.setrecursionlimit(10**7)
# input = sys.stdin.readline

s = input()
dot_count = 0
for i in range(0, len(s)):
  if s[i] == "i" or s[i] == "j":
    dot_count += 1
print(dot_count)