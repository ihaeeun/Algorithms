from collections import defaultdict

def solution(skill, skill_trees):
    answer = 0
    for s in skill_trees:
        cur = list(s)
        indegree = [0 for _ in range(len(cur))]
        graph = [set() for _ in range(len(cur))]
        for i in range(len(cur)-1):
            graph[i].add(i+1)
            indegree[i+1] += 1
        for i in range(len(skill)-1):
            if skill[i] in cur and skill[i+1] in cur:
                graph[cur.index(skill[i])].add(cur.index(skill[i+1]))
                if cur.index(skill[i+1]) - cur.index(skill[i]) != 1:
                    indegree[cur.index(skill[i+1])] += 1
        print(cur, graph, indegree)

        if indegree[0] == 0:
            print(s)
            q = [0]
            visited = set()
            while q:
                src = q.pop(0)
                visited.add(src)
                for dst in graph[src]:
                    indegree[dst] -= 1
                    if indegree[dst] == 0:
                        q.append(dst)
            if len(visited) == len(s):
                answer += 1
    return answer


skill = "CBD"
skill_trees = ["BACDE", "CBADF", "AECB", "BDA"]
print(solution(skill, skill_trees))
