T = int(input())
for t in range(1, T + 1):
    n = int(input())
    for i in range(1, n+1):
        tmp = ""
        if i % 2:
            for j in range(i*n-n+1, i*n+1):
                tmp += str(j)
        else:
            for j in range(i*n, i*n-n, -1):
                tmp += str(j)
        print(tmp)

    # print("#{0} {1}".format(t, answer))
