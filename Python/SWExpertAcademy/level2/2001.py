for t in range(int(input())):
    n,m=map(int, input().split())
    a=[[int(i) for i in input().split()]for i in range(n)]
    r=[]
    k=0
    while k<n:
        s = 0
        for i in range(k, k+m):
            for j in range(m):
                s+=a[i][j]
        r.append(s)
        k+=1
    print(r)