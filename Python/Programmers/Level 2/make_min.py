def solution(A, B):
    answer = 0
    length = len(A)
    A.sort()
    B.sort()

    for i in range(length):
        answer += A[i] * B[length-1-i]

    return answer
# return sum(a*b for a, b in zip(sorted(A), sorted(B, reverse=True)))

A = [1, 4, 2]
B = [5, 4, 4]
print(solution(A, B))
