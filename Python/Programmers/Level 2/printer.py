from queue import PriorityQueue
import heapq


def solution(priorities, location):
    q = []
    for idx, val in enumerate(priorities):
        heapq.heappush(q, (-val, idx))

    print(q)
    q = sorted(q, key=lambda x: (x[0], x[1]))
    print(q)
    tmp = []
    for i in q:
        heapq.heappush(tmp, (i, -i[1]))
    print(tmp)

    answer = tmp[location][1] * -1
    return answer


priorities = [1, 1, 9, 1, 1, 1]
location = 0
print(solution(priorities, location))
