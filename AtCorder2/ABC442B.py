import sys

# sys.setrecursionlimit(10**7)
# input = sys.stdin.readline

def solve():
    input_data = sys.stdin.read().split()
    Q = int(input_data[0])
    queries = map(int, input_data[1:])
    
    volume = 0
    is_play = False
    results = []
    
    for a in queries:
        if a == 1:
            volume += 1
        elif a == 2:
            if volume > 0:
                volume -= 1
        else:
            is_play = not is_play
        
        if volume >= 3 and is_play:
            results.append("Yes")
        else:
            results.append("No")
    
    print('\n'.join(results))

if __name__ == "__main__":
    solve()
