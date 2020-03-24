def solution(x, n):
    answer = []

    for i in range(n):
        answer.append(i * x + x)

    return answer


x = -4
n = 2
print(solution(x, n))