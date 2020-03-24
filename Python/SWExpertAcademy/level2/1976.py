for t in range(int(input())):
    a=[int(i) for i in input().split()]
    m=a[1]+a[3]
    print(f'#{t}',((a[0]+a[2])%12)+(m//60),m%60)
