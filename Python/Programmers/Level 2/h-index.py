def solution(citations):
    citations.sort()
    answer = 0
    for i in range(len(citations)):
        h = citations[i]
        if len(citations[i:]) <= h < len(citations[:i + 1]):
            answer = h
            break

    return answer


citations = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
print(solution(citations))
