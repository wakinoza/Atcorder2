
# 鉄則問題集A56 文字列のハッシュ
import sys

def get_hash(s, x , y):
    answer = hash(s[x - 1: y])
    return answer

def solve():
    input_data = iter(sys.stdin.read().split())
    n, q = int(next(input_data)), int(next(input_data))
    s = next(input_data)

    MOD = (1 << 61) - 1
    BASE = 100
    T = [0] * (n + 1)
    power = [1] * (n + 1)
    
    for i in range(1, n + 1):
        char_val = ord(s[i - 1]) - ord('a') + 1
        T[i] = (T[i - 1] * BASE + char_val) % MOD
        power[i] = (power[i - 1] * BASE) % MOD

    def get_hash(l, r):
        res = (T[r] - T[l - 1] * power[r - l + 1]) % MOD
        return res

    answer = []
    for _ in range(q):
        a, b, c, d = int(next(input_data)), int(next(input_data)), int(next(input_data)), int(next(input_data))
        if get_hash(a, b) == get_hash(c, d):
            answer.append("Yes")
        else:
            answer.append("No")
    print("\n".join(map(str, answer)))

if __name__ == "__main__":
    solve()