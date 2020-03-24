from operator import itemgetter
def solution(strings, n):
    dic = {string: cs for string, cs in zip(strings, [i[n] for i in strings])}
    print(dic)

    res = sorted(sorted(dic.items()), key=(lambda x: x[1]))
    print(res)

    return [i[0] for i in res]


def solution2(strings, n):
    return sorted(sorted(strings), key=itemgetter(n))


# strings = ["sun", "bed", "car"]
strings = ["abce", "abcd", "cdx"]
n = 1
print(solution(strings, n))