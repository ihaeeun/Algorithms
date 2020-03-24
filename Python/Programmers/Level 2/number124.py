def recu(n):
    T = [0, 1, 2, 4]

    if int(n) % 3 == 0:
        q = n // 3 - 1
        r = T[3]
        print(q, r)
    else:
        q, r = divmod(int(n), 3)
        r = T[r]
    print(n, ": ", q, r)

    if q == 0:
        return str(r)
    else:
        return recu(q) + str(r)


def solution(n):
    answer = recu(n)
    return answer


print(solution(n=15))


def sol2(n):
    t = "124"

    if n <= 3:
        return t[n-1]
    else:
        q, r = divmod(n-1, 3)
        return sol2(q) + t[r]


print(sol2(n=15))
