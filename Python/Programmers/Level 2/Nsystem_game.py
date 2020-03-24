def recu(num, n):
    table = "0123456789ABCDEF"
    q, r = divmod(num, n)
    if q == 0:
        return table[r]
    else:
        return recu(q, n) + table[r]


def solution(n, t, m, p):
    answer = ''

    string = ""
    for i in range(t*m):
        string += (recu(i, n))
    print(string)

    li = map(''.join, zip(*[iter(string)] * m))
    # li = [string[i:i+m] for i in rage(0, len(string), m)]
    print(li)
    for i in li:
        answer += i[p-1]
        if len(answer) == t:
            break
    return answer


n = 2
t = 4
m = 2
p = 1
print(solution(n, t, m, p))
