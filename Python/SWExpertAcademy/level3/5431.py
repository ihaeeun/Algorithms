for t in range(int(input())):
    n,k=map(int,input().split())
    a=[0 for i in range(n)]
    s=[int(i) for i in input().split()]
    for i in s:a[i-1]+=1
    print(f'#{t+1}', *[i+1 for i in range(len(a)) if a[i]==0])