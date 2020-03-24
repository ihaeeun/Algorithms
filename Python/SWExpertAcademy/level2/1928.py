dic={v:k for k,v in enumerate('ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/')}
for t in range(1,int(input())+1):
    s = input()
    print(f'#{t}',end=' ')
    for i in range(0, len(s), 4):
        b = bin((dic[s[i]]<<18) + (dic[s[i+1]]<<12) + (dic[s[i+2]]<<6) + (dic[s[i+3]]))
        z, y, x = int(b[-8:], 2), int(b[-16:-8], 2), int(b[2:-16],2)
        print(chr(x), chr(y), chr(z), sep='',end='')
