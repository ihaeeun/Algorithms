for t in range(int(input())):
    s=[]
    a=1
    for i in range(9):
        s.append([int(i) for i in input().split()])
        if len(set(s[i]))<9:
            a=0;break
    if t == 8:
        print(s)
    if a:
        for i in range(9):
            print([s[j][i] for j in range(9)])
            if len(set([s[j][i] for j in range(9)]))<9:
                if t == 8:
                    print('2')
                a=0;break
    if a:
        for i in range(3):
            for j in range(9):
                if not j%3:
                    tmp = []
                tmp += [s[k][j] for k in range(i*3, i*3+3)]
            if len(set(tmp))<9:
                a=0; break

    print(f'#{t+1}',a)