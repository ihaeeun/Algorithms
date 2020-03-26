global tree
global n

def postorder (k):
    if not tree[k]:
        a = postorder(k*2)
        b = postorder(k*2+1) if k*2+1<=n else 0
        tree[k]= a+b
    return tree[k]

for t in range(int(input())):
    n,m,l = map(int, input().split())
    tree = [0] * (n + 1)
    for i in range(m):
        a, b = map(int, input().split())
        tree[a] = b
    postorder(1)
    print(f'#{t+1}',tree[l])