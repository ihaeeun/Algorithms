for t in range(1,11):
    n,a=int(input()),[int(i)for i in input().split()]
    print(f'#{t} {sum([max(0,a[i]-max(a[i-2:i]+a[i+1:i+3]))for i in range(2,n-2)])}')