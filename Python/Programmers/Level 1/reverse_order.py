def solution(s):
    li = list(s)
    li.sort(reverse=True)
    answer = ''.join(li)
    return answer


print(solution("Zbcdefg"))
