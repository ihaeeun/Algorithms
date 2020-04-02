answer = 0

def dfs(numbers, target, idx, value):
    global answer
    if idx == len(numbers):
        if target == value:
            answer += 1
        return

    dfs(numbers, target, idx+1, value+numbers[idx])
    dfs(numbers, target, idx+1, value-numbers[idx])


def solution(numbers, target):
    dfs(numbers, target, 0, 0)
    return answer


numbers = [1,1,1,1,1]
target = 3

print(solution(numbers, target))