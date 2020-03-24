import heapq
from operator import itemgetter

def solution(number, k):
    answer = ''
    heap = []
    nums = list(number)
    nums = [int(i) for i in number]

    for num in enumerate(nums):
        heapq.heappush(heap, num)
    print(heap)

    heap.sort(key=itemgetter(1), reverse=True)
    pre = [heap[i] for i in range(len(number) - k)]

    pre.sort(key=itemgetter(0))
    print(pre)

    for i in pre:
        answer += str(i[1])
    return answer


print(solution("4177252841", 3))
