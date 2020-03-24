for t in range(int(input())):
    s=input()
    r=s[0]
    for i in range(1, 10):
        if r[:i] != s[i:i+len(r)]:
            r+=s[i]
        else:
            break
    print(f'#{t+1} {len(r)}')
