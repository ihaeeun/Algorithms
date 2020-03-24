for t in range(1,11):
    input()
    l,m,x,z,w=100,0,0,0,0
    a=[[] for i in range(l)]
    for i in range(l):
        a[i]=[int(j) for j in input().split()]
    for i in range(l):
        x = sum(a[i])
        y=0
        for j in range(l):
            y+=a[j][i]
            if i==j:z+=a[i][j]
            elif i+j==l-1:w+=a[i][j]
        if m < max(x,y,z,w):m=max(x,y,z,w)
    print(f'#{t}',m)