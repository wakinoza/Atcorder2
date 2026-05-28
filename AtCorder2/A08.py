import sys

def solve():
    # 入力をすべて一括で取得してイテレータ化
    it = map(int, sys.stdin.read().split())
    h, w = next(it), next(it)
    
    # 1. 2次元累積和用のテーブル（最初から H+1 x W+1 のサイズで 0 初期化）
    sum_grid = [[0] * (w + 1) for _ in range(h + 1)]
    
    # 2. 元の grid を作らずに、入力ストリームから直接累積和を構築
    for i in range(h):
        for j in range(w):
            val = next(it)  # その場で次の要素を取得
            sum_grid[i + 1][j + 1] = sum_grid[i][j + 1] + sum_grid[i + 1][j] - sum_grid[i][j] + val

    # 3. クエリの処理
    q = next(it)
    answers = []
    for _ in range(q):
        a, b, c, d = next(it), next(it), next(it), next(it)
        current_sum = sum_grid[c][d] - sum_grid[a - 1][d] - sum_grid[c][b - 1] + sum_grid[a - 1][b - 1]
        answers.append(str(current_sum))
        
    # まとめて出力
    print("\n".join(answers))

if __name__ == "__main__":
    solve()