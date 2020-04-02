for t in range(int(input())):
    s=[int(i)for i in input().split()]
    for i in range(len(s)):
        if s[i]<40: s[i]=40
    print(f'#{t+1}',sum(s)//len(s))