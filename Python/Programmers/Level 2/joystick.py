def solution(name):
    if [name[i] for i in range(len(name))].count('A') == len(name):
        return 0
    answer = len(name) - 1
    if name[1] == 'A':
        answer -= 1
    for i in range(len(name)):
        answer += ord('Z') - ord(name[i]) + 1 if name[i] > 'M' else ord(name[i]) - ord('A')
    return answer


print(solution("AAA"))
