# ABC
# import sys
# sys.setrecursionlimit(10**7)
# input = sys.stdin.readline

q = int(input())
volume = 0
is_play = False
for _ in range(0, q) :
  a = int(input())
  if a == 1:
    volume += 1
  if a == 2:
    volume = max(volume - 1, 0)
  if a == 3:
    if is_play:
      is_play = False
    else:
      is_play = True
  if (volume >= 3 and is_play):
    print("Yes")
  else:
    print("No")

