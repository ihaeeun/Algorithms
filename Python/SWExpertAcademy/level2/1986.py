for t in range(int(input())):
    s=0
    for i in range(1, int(input())+1):
        s+=i if i%2 else -i
    print(f"#{t+1} {s}")