for t in range(int(input())):
    p=input()
    s,e=0,len(p)-1
    a=1
    while s<e:
        if p[s]==p[e]:
            s+=1; e-=1
        else:
            a=0;break
    print(f'#{t+1} {a}')
