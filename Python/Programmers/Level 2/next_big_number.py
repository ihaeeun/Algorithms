def solution(n):
    answer = n
    bin_n = bin(n).count('1')

    while True:
        answer += 1
        if bin_n == bin(answer).count('1'):
            return answer


print(solution(n=15))
