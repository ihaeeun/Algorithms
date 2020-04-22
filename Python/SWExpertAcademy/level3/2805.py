for t in range(int(input())):
    n=int(input());field=[];a=0
    for i in range(n):
        e=input()
        field.append([int(e[i]) for i in range(len(e))])
        a+=sum(j for j in field[i][i-n//2:n-(i-n//2)]) if i>n//2 else sum(j for j in field[i][n//2-i:n//2+i+1])
        print(f'#{t+1}',a)
