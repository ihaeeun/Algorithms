for t in range(1,11):
    d=int(input())
    b=[int(i) for i in input().split()]
    for i in range(d):
        if max(b)-min(b)==1:break
        b[b.index(max(b))]-=1;b[b.index(min(b))]+=1
    print(f'#{t} {max(b)-min(b)}')
