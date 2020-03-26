def recu(n,m):
    s=n
    if m<1:return 1
    return s*recu(n, m-1)

for t in range(10):
    input();
    n,m=map(int,input().split())
    print(f'#{t+1}', recu(n,m))