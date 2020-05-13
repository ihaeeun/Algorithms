def dfs(v):
    visited.add(v)
    for dst in adj[v]:
        if dst not in visited:
            dfs(dst)


n, m = map(int, input().split())
adj = [set() for _ in range(n)]
for _ in range(m):
    u, v = map(int, input().split())
    adj[u - 1].add(v - 1)
    adj[v - 1].add(u - 1)

answer = 0
visited = set()

for i in range(n):
    if i not in visited:
        dfs(i)
        answer += 1
        print(i, visited, answer)
print(answer)