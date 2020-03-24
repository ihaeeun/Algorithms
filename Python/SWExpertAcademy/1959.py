T = int(input())

for t in range(T+1):
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    if len(a) > len(b):
        a, b = b, a

    arr = []
    for i in range(len(a)):
        sum = 0
        for j in (i, i+len(a)):
            sum += a[i] * b[j]
            print(i, j, sum)
        arr.append(sum)
    # print(arr)
    print(max(arr))
