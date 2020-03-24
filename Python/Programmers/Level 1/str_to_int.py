def solution(s):
    answer = 0

    # if s[0] is '-':
    #     answer = int(s[1:]) * -1
    # else:
    #     answer = int(s)

    answer = int(s[1:]) * -1 if s[0] is '-' else int(s)

    return answer


print(solution('-1234'))