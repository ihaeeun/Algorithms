month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

T = int(input())

for t in range(1, T+1):
    li = list(map(int, input().split()))
    answer = 0
    if li[0] == li[2]:
        answer = li[3] - li[1] + 1
    else:
        for i in range(li[0], li[2]):
            answer += month[i-1]
        answer = answer - li[1] + li[3] + 1
    print("#{0} {1}".format(t, answer))
