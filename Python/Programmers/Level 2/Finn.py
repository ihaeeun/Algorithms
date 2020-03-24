def solution(n):
    answer = 1
    h = n // 2 + 1
    input = 1
    while input <= h:
        sum = 0
        for i in range(input, h+1):
            sum += i
            if sum == n:
                answer += 1
                break
            if sum > n:
                break
            # print(i, sum)
        print(input, sum, answer)
        input += 1

    return answer


print(solution(n=15))
