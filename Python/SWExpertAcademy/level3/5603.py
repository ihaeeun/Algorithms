for t in range(int(input())):
    n=int(input());h=[]
    for i in range(n):h.append(int(input()))
    s,a=sum(h)//n,0
    for i in h:
        if i>s:a+=i-s
    print(f'#{t+1}',a)
