def solution(n, lost, reserve):
    tmp = []
    for i in lost:
        if reserve.count(i):
            reserve.remove(i)
            tmp.append(i)
    for i in tmp:
        lost.remove(i)



    return n - len(lost) + len(reserve) if len(lost) >= len(reserve) else n


n = 10
lost = [3, 9, 10]
reserve = [3, 8, 9]
print(solution(n, lost, reserve))
