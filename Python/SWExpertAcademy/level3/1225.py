for t in range(10):
    input()
    p=[int(i) for i in input().split()]
    s=p[0]
    while s>0:
        for i in range(1, 6):
            p=p[1:]+[0]if p[0]-i<=0 else p[1:]+[p[0]-i]
            s=p[-1]
            if not p[-1]:break
    print(f'#{t+1}', *p)