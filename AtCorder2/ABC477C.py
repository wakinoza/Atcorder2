# ABC477C
import sys

def solve():
    input = iter(sys.stdin.read().split())
    Q, S, T = int(next(input)), next(input), next(input)
    s_size = len(S)
    t_size = len(T)
    is_match = [0] * s_size
    for i in range(s_size - t_size + 1):
        if S[i:i + t_size] == T:
            is_match[i] = 1
    cum = [0] * (s_size + 1)
    for i in range(s_size):
        matched = is_match[i - t_size + 1] if i - t_size + 1 >= 0 else 0
        cum[i + 1] = cum[i] + matched
    results = []
    for _ in range(Q):
        L, R = int(next(input)) - 1, int(next(input)) - 1
        if (R - L + 1) < t_size:
            results.append("No")
            continue

        count = cum[R + 1] - cum[L + t_size - 1]
        if count > 0:
            results.append("Yes")
        else:
            results.append("No")
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()


# # def solve():
#     input = iter(sys.stdin.read().split())
#     Q, S, T = int(next(input)), next(input), next(input)
#     results = []
#     for _ in range(Q):
#         L, R = int(next(input)) - 1, int(next(input))
#         index = S.find(T, L, R)
#         if index == -1:
#             results.append("No")
#         else :
#             results.append("Yes")
#     print("\n".join(map(str, results)))
