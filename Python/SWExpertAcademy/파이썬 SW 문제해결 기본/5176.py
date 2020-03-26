global data
global tree

def inorder(n, last):
    global data
    global tree
    if n <= last:
        inorder(n*2, last)
        tree[n] = data
        data += 1
        inorder(n*2+1, last)

for t in range(int(input())):
    n = int(input())
    tree = [0]*(n+1)
    data = 1
    inorder(1, n)
    print(f'#{t+1}', tree[1], tree[n//2])
