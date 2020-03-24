def solution(n):
    answer = 0

    for i in range(1, round(n/2) + 1):
        if n % i == 0:
            print(i)
            answer += i

    return answer + n


print(solution(12))