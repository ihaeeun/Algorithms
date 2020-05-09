max_cnt = 0

def dfs(origin, cnt):
    global max_cnt
    visited[origin] = True
    max_cnt = cnt if cnt > max_cnt else max_cnt

    for dest in range(1, n+1):
        if (matrix[origin][dest] == 1 and not visited[dest]) or origin == 0:
            dfs(dest, cnt+1)

    visited[origin] = False


for t in range(int(input())):
    max_cnt = 0
    n, m = map(int, input().split())

    visited = [False for _ in range(n+1)]
    matrix = [[0 for _ in range(n+1)] for _ in range(n+1)]

    for i in range(m):
        x, y = map(int, input().split())
        matrix[x][y] = 1
        matrix[y][x] = 1

    dfs(0, 0)

    print(f'#{t+1}', max_cnt)