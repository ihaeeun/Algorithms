m=[50000,10000,5000,1000,500,100,50,10]
for t in range(int(input())):
    w=int(input())
    l=[0 for i in range(8)]
    while w>10:
        for i in range(8):
            if w>=m[i]:
                l[i]+=w//m[i]; w-=m[i]*l[i]
    print(f'#{t+1}');print(*l)