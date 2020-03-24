def solution(n):
    answer = 0

    for i in range(1, n+1):
        answer += 1 if is_prime(i) else 0

    return answer


def is_prime(n):
    if n == 1 or (n != 2 and n % 2 == 0):
        return False
    elif n == 2:
        return True
    e = round(n ** 0.5) + 1
    for i in range(3, e, 2):
        if n % i == 0:
            return False
    return True


print(solution(10))
