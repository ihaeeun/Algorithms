for t in range(int(input())):
    n = int(input())-1
    a = [int(i) for i in input().split()]
    min = a[n]
    max = a[n]
    p = 0
    for i in reversed(a):
        if i < max:
            p += max-i
            min = i
        else:
            max = i
    print(f'#{t} {p}')
