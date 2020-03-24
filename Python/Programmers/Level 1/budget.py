def solution(d, budget):
    answer = 0

    d = sorted(d)

    for i in d:
        budget -= i
        if budget < 0:
            break
        answer += 1

    return answer


d = [2, 2, 3, 3]
budget = 10
print(solution(d, budget))
