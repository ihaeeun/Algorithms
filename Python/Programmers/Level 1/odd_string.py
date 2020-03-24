def solution(s):
    str = s.split(' ')
    tmp = ['' for i in range(len(str))]

    for i in range(len(str)):
        for j in range(len(str[i])):
            tmp[i] += str[i][j].upper() if j % 2 == 0 else str[i][j].lower()

    answer = " ".join(tmp)

    return answer


print(solution("try hello world"))
