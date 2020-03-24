def solution(n, arr1, arr2):
    answer = []
    map1 = []
    map2 = []

    for i in range(n):
        map1.insert(i, bin(arr1[i])[2:].zfill(n))
        map2.insert(i, bin(arr2[i])[2:].zfill(n))

    print(map1)
    print(map2)

    for i in range(n):
        tmp = ""
        for j in range(n):
            tmp += ' ' if map1[i][j] == '0' and map2[i][j] == '0' else '#'

        print(tmp)
        answer.insert(i, tmp)

    return answer


n = 5
arr1 = [9, 20, 28, 18, 11]
arr2 = [30, 1, 21, 17, 28]
print(solution(n, arr1, arr2))