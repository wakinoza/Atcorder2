# ABC478A
import sys



def solve():
    n, m = map(int, input().split())
    results = [0] * n
    m_mod = m % n
    m_divide = m // n
    for i in range(n):
        if i < m_mod:
            results[i] = m_divide + 1
        else:
            results[i] = m_divide
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()


