visited = []


def dfs(src):
    visited[src] = True

    for dst in range(len(computers[src])):
        if not visited[dst] and computers[src][dst] == 1:
            dfs(dst)


def solution(n, computers):
    global visited

    answer = 0
    visited = [False for _ in range(n)]
    for i in range(n):
        if not visited[i]:
            dfs(i)
            answer+=1

    return answer


n = 3
computers = [[1, 1, 0], [1, 1, 0], [0, 0, 1]]
print(solution(n, computers))