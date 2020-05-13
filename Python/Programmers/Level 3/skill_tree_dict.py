from collections import defaultdict

def solution(skill, skill_trees):
    answer = 0
    for s in skill_trees:
        cur = list(s)
        indegree = defaultdict(int)
        graph = defaultdict(set)

        for i in range(len(cur)-1):
            graph[cur[i]].add(cur[i+1])
            indegree[cur[i+1]] += 1

        for i in range(len(skill)-1):
            if skill[i] in cur and skill[i+1] in cur:
                graph[skill[i]].add(skill[i+1])
                if cur.index(skill[i + 1]) - cur.index(skill[i]) != 1:
                    indegree[skill[i + 1]] += 1
            else:
                indegree[skill[i+1]] += 1
        print(cur, dict(graph), dict(indegree))

        if not indegree[cur[0]]:
            print(s)
            q = [cur[0]]
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