import re
def solution(dartResult):
    # split input
    input_list = re.split('([0-9]+)', dartResult)
    del input_list[0]

    # create dict
    sdt = {'S': 1, 'D': 2, 'T': 3}

    answer_list = []

    for i in range(3):
        answer_list.append(int(input_list[i*2]) ** sdt[input_list[i*2+1][0]])
        if len(input_list[i*2+1]) > 1:
            if input_list[i*2+1][1] == '*':
                if len(answer_list) > 1:
                    answer_list[i-1] *= 2
                answer_list[i] *= 2

            if input_list[i*2+1][1] == '#':
                answer_list[i] *= -1

        print(answer_list)

    return sum(answer_list)


dartResult = "1D2S#10S"
print(solution(dartResult))
