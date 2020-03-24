import math


def solution(n, a, b):
    answer = 1
    if a > b:
        a, b = b, a

    log = math.log(n, 2)
    if a <= n / 2 < b:
        return int(log)

    while b - a > 1:
        a = a // 2 + 1 if a % 2 == 1 else a // 2
        b = b // 2 + 1 if b % 2 == 1 else b // 2
        print(a, b)
        answer += 1

    if b - a == 1 and a % 2 == 0:
        answer += 1

    return answer


print(solution(n=8, a=2, b=8))


# 25
