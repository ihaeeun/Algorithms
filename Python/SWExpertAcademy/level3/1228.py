for t in range(10):
    n = int(input())
    c = input().split()
    m = int(input())
    a = input().split('I')
    b = []
    for i in range(len(a)):
        b.append(a[i].split())

    for i in range(1, len(b)):
        x, y= int(b[i][0]), int(b[i][1])
        s = b[i][2:]
        print(s)
        for j in range(y):
            c.insert(x+j, s[j])
        print(c)

    print(f'#{t+1}', *c[:10])