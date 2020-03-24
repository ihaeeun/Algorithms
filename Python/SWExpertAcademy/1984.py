for t in range(int(input())):
    a=[int(i) for i in input().split()]
    a.remove(max(a))
    a.remove(min(a))
    print(t, a)
    print(f'#{t+1} {round(sum(a)/len(a))}')