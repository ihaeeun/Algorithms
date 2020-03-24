def recu(l, n, s):
    print(n)
    if not l[n-1]:
        return 1
    for i in range(len(l[n-1])):
        s += recu(l, l[n-1][i], s)
    return s

for t in range(int(input())):
    e,n = map(int,input().split())
    l = [[] for i in range(e+1)]
    c = [0]+[int(i) for i in input().split()]
    for i in range(1, e*2, 2):
        l[c[i]-1].append(c[i+1])
    print(l)
    s=1
    print(f'#{t+1} {recu(l, n, s)}')
