def solution(answers):
    student = [[1, 2, 3, 4, 5], [2, 1, 2, 3, 2, 4, 2, 5], [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]
    count = [0 for i in range(len(student))]

    for i in range(3):
        for j in range(len(answers)):
            if answers[j] == student[i][j % len(student[i])]:
                count[i] += 1

    answer = [i + 1 for i in range(len(count)) if count[i] == max(count)]

    return answer


answers = [1, 3, 2, 4, 2]
print(solution(answers))
