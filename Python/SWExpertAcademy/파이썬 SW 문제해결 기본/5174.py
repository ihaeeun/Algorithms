global node
global s

def recu(n):
    global s
    if not node[n]:
        return
    for i in range(len(node[n])):
        s += 1
        recu(node[n][i])
        print(s)

for t in range(int(input())):
    global s
    e,n = map(int,input().split())
    node = [[] for i in range(e+2)]
    c = [0]+[int(i) for i in input().split()]
    print(c)
    for i in range(1, e*2, 2):
        node[c[i]]+=[c[i+1]]
    print(node)
    s=1
    recu(n)
    print(f'#{t+1} {s}')
