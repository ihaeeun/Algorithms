for t in range(int(input())):
    sum=0
    for i in range(int(input())):l,r=map(int,input().split());sum+=r-l+1
    print(f'#{t+1}',sum)