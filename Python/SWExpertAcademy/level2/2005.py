# dp로 푼 것!!
for t in range(int(input())):
    n=int(input())
    p=[[1]]
    if n==2:
        p+=[[1,1]]
        print(p)
    elif n > 2:
        p += [[1,1]] +[[] for i in range(n - 2)]
        for i in range(2, n):
            for j in range(i+1):
                if j==0 or j==i:
                    p[i].append(1)
                else:
                    p[i].append(p[i-1][j-1]+p[i-1][j])
    print(f'#{t+1}')
    for i in p:print(*i)