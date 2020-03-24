T = int(input())
for t in range(1, T + 1):
    n = int(input())
    cnt = [0 for i in range(5)]
    while n > 1:
        if not n % 11:
            n //= 11
            cnt[4] += 1
        elif not n % 7:
            n //= 7
            cnt[3] += 1
        elif not n % 5:
            n //= 5
            cnt[2] += 1
        elif not n % 3:
            n //= 3
            cnt[1] += 1
        elif not n % 2:
            n //= 2
            cnt[0] += 1

    print("#{0} {1}".format(t, ' '.join(map(str, cnt))))
