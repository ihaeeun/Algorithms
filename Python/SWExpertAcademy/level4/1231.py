global word
global s

def inorder(n):
    global s
    if n<len(word):
        inorder(n*2)
        s+=word[n]
        inorder(n*2+1)

for t in range(1,11):
    n = int(input())
    word = ['']*(n+1)
    s=''
    for i in range(1, n+1):
        tmp = input().split()
        word[int(tmp[0])] = tmp[1]

    inorder(1)
    print(f'#{t}', s)