def solution(s):
    answer = ''

    li = s.split()
    for i in range(len(li)):
        li[i] = int(li[i])

    answer = str(min(li)) + " " + str(max(li))
    return answer


print(solution(s="1 2 3 4"))
