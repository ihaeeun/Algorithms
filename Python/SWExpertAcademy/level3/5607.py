for t in range(int(input())):
    n,r=map(int,input().split())
    if not r:
        a=0
    else:
        a=1
        for i in range(1, r+1):
            print(i, n)
            a*=n/i;n-=1
            print(a)
        print(f'#{t+1}',int(a%1234567891))