def solution(N, stages):
    answer = []
    not_clear = []
    reach = []
    fail_rate = []

    # init array
    for i in range(N):
        not_clear.insert(i, 0)
        reach.insert(i, 0)

    for i in range(len(stages)):
        if stages[i] <= N:
            not_clear[stages[i] - 1] += 1

        for j in range(N):
            if stages[i] > j:
                reach[j] += 1

    print(not_clear)
    print(reach)

    #     실패율
    for i in range(N):
        if reach[i] == 0:
            fail_rate.append(0.0)
        else:
            fail_rate.append(not_clear[i] / reach[i])
    print(fail_rate)
    answer = sorted(range(len(fail_rate)), key=lambda k: fail_rate[k], reverse=True)

    for i in range(N):
        answer[i] += 1

    return answer


N = 5
stages = [2, 1, 2, 4, 2, 4, 3, 3]
print(solution(N, stages))
