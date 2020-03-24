def gcd(n, m):
    # if m == 0:
    #     return n
    # else:
    #     return gcd(m, n % m)
    return n if m == 0 else gcd(m, n % m)


def gcm(n, m):
    return n * m // gcd(n, m)


def solution(n, m):
    answer = [gcd(n, m), gcm(n, m)]
    return answer


print(solution(2, 5))
