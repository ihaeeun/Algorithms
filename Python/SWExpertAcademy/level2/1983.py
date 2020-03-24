g=['A+','A0','A-','B+','B0','B-','C+','C0','C-','D0']
for t in range(int(input())):
    n,k=map(int,input().split())
    s=[0 for i in range(n)]
    for i in range(n):
        m,f,a=map(int, input().split())
        s[i]=(m*35+f*45+a*20)/100
    tmp = sorted([(k+1,v) for k, v in enumerate(s)], key=lambda x: x[1], reverse=True)
    print(f'#{t + 1} {g[tmp.index([x for x in tmp if x[0]==k][0])//(n//10)]}')
