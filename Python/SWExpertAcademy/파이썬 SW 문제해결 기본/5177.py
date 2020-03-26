import heapq

for t in range(int(input())):
    n=int(input())-1
    h=[]
    a=[int(i) for i in input().split()]
    for i in a:
        heapq.heappush(h, i)
    print(h)
    s=0
    while n>0:
        n = n//2 if n % 2 else n//2-1
        print(n, h[n])
        s+=h[n]
    print(f'#{t+1}', s)