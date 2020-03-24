def solution(arr):
    arr.append(10)
    answer = []
    for i in range(len(arr) - 1):
        if arr[i] != arr[i + 1]:
            answer.append(arr[i])

    return answer


# return [i for i, j in zip(arr, arr[1:]+[10] if i != j]

arr = [4,4,4,3,3]
print(solution(arr))
