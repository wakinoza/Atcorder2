# 鉄則問題集A49（セグメント木）
import sys
import operator

class SegmentTree:
    def __init__(self, data, op, e):
        """
        :param data: 初期化用配列
        :param op: 二項演算 (例: min, max, operator.add, math.gcd)
        :param e: 単位元 (例: minならfloat('inf'), 和なら0)
        """
        self.n = len(data)
        self.op = op
        self.e = e
        self.size = 1 << (self.n - 1).bit_length() if self.n > 0 else 1
        self.tree = [e] * (2 * self.size)
        
        # 葉ノードに初期値を格納
        for i in range(self.n):
            self.tree[self.size + i] = data[i]
            
        # ボトムアップで木を構築
        for i in range(self.size - 1, 0, -1):
            self.tree[i] = self.op(self.tree[2 * i], self.tree[2 * i + 1])

    def update(self, i, val):
        """インデックス i (0-indexed) の値を val に更新: O(log N)"""
        i += self.size
        self.tree[i] = val
        i >>= 1
        while i > 0:
            self.tree[i] = self.op(self.tree[2 * i], self.tree[2 * i + 1])
            i >>= 1

    def query(self, l, r):
        """半開区間 [l, r) の演算結果を取得 (0-indexed): O(log N)"""
        s_left = self.e
        s_right = self.e
        
        l += self.size
        r += self.size
        
        while l < r:
            if l & 1:
                s_left = self.op(s_left, self.tree[l])
                l += 1
            if r & 1:
                r -= 1
                s_right = self.op(self.tree[r], s_right)
            l >>= 1
            r >>= 1
            
        return self.op(s_left, s_right)

    def get(self, i):
        """インデックス i の単一要素を取得: O(1)"""
        return self.tree[self.size + i]

def solve():
    it = iter(map(int, sys.stdin.read().split()))
    n, q = next(it), next(it)
    a = [0] * n
    st = SegmentTree(a, op=operator.add, e=0)
    results = []
    for _ in range(q):
        query = next(it)
        if query == 1:
            pos, x = next(it) - 1, next(it)
            st.update(pos, x)
        else:
            l, r = next(it) - 1, next(it) - 1
            results.append(st.query(l, r))
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()

