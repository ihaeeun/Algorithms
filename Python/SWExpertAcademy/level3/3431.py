for t in range(int(input())):
    l,u,x = map(int, input().split())
    if x>u:a=-1
    else: a=l-x if x>l else 0
    print(f'{t+1}',a)