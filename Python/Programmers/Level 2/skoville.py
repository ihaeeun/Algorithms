import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    while scoville[0] < K:
        if len(scoville) == 1:
            return -1
        mix = heapq.heappop(scoville) + heapq.heappop(scoville) * 2
        heapq.heappush(scoville, mix)
        answer += 1
        print(scoville)

    return answer


scoville = [1, 2, 3, 9, 10, 12]
K = 1000
print(solution(scoville, K))

