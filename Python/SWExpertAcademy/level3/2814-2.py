max_cnt = 0

def dfs(origin, cnt):
    global max_cnt
    visited[origin] = True
    max_cnt = cnt if cnt > max_cnt else max_cnt

    for dest in range(1, n+1):
        if origin == 0 or ((not visited[dest]) and (dest in node_list[origin])):
            dfs(dest, cnt+1)

    visited[origin] = False


for t in range(int(input())):
    max_cnt = 0
    n, m = map(int, input().split())

    visited = [False for _ in range(n+1)]
    node_list = [set() for _ in range(n+1)]

    for i in range(m):
        x, y = map(int, input().split())
        node_list[x].add(y)
        node_list[y].add(x)

    dfs(0, 0)

    print(f'#{t+1}', max_cnt)