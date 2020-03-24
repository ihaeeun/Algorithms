T = int(input())
for t in range(1, T + 1):
    n = int(input())
    s = ''
    for k in range(n):
        c, i = map(str, input().split())
        tmp = c * int(i)
        s += tmp

    length = len(s)
    print('#', t, sep='')
    for i in range(len(s)//10 + 1):
        print(s[i*10:i*10+10])
