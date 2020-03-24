T = int(input())
for t in range(1, T+1):
    n = int(input())
    d = 0
    current = 0

    for i in range(n):
        tmp = list(map(int, input().split()))
        if not tmp[0]:
            d += current
        elif tmp[0] == 1:
            current += tmp[1]
            d += current
        else:
            if tmp[1] <= current:
                current -= tmp[1]
                d += current
        print(current)
    print('#{0} {1}'.format(t, d))
