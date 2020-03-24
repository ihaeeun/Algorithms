def solution(n):
    answer = -1
    root = n ** 0.5

    if root % 1 == 0:
        answer = (n + 1) ** 2

    return answer


print(solution(122))
