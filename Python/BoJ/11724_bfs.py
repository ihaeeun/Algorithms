n, m = map(int, input().split())
adj = [set() for _ in range(n)]
for _ in range(m):
    u, v = map(int, input().split())
    adj[u - 1].add(v - 1)
    adj[v - 1].add(u - 1)

answer = 0
q = []
visited = [False for _ in range(n)]

for i in range(n):
    if not visited[i]:
        answer += 1
        q.append(i)
    while q:
        fr = q.pop(0)
        # visited[fr] = True
        for to in adj[fr]:
            if not visited[to]:
                visited[to] = True
                q.append(to)

print(answer)