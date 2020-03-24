T = int(input())
for t in range(T):
    cnt = [0 for i in range(10)]
    n = int(input())
    k = n
    answer = 0
    while cnt.count(0):
        tmp = str(k)
        li = [int(tmp[i]) for i in range(len(tmp))]
        for i in li:
            cnt[i] += 1
        print(tmp, cnt)
        k += n
        # answer += 1

    print("#{0} {1}".format(t+1, k-n))
