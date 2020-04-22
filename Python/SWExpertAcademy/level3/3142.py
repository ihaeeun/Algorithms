for t in range(int(input())):
    a,b=map(int, input().split())
    x=a-b;y=b-x
    print(f'#{t+1}',y,x)