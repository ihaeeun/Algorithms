for t in range(int(input())):
    x=input();l=len(x)
    a=[0 for i in range(10)]
    for i in range(l):a[int(x[i])]+=1
    print(f'#{t+1}', sum([1 for i in a if i>0]))