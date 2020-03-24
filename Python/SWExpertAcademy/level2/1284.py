T = int(input())
for t in range(T):
    p, q, r, s, w = map(int, input().split())
    a = p * w
    b = q + (w-r) * s if w > r else q
    print("#{0} {1}".format(t+1, min(a, b)))
