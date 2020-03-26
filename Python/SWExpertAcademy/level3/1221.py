m=["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]
# d={v:i for i, v in enumerate(m)}
# k=sorted({i for i in enumerate(m)})
# for t in range(int(input())):
#     n=int(input().split()[1])
#     s=sorted([d[i] for i in input().split()])
#     a=[]
#     for i in s:
#         a+=[k[i][1]]
#     print(f'#{t+1}')
#     print(*a)

# for t in range(int(input())):
#     input()
#     s=[i for i in input().split()]
#     a=[]
#     for i in range(len(m)):
#         a += [s.count(m[i])]
#     r=''
#     for i in range(len(a)):
#         r+=(m[i]+' ')*a[i]
#
#     print(f'#{t}\n{r}')

for t in range(int(input())):
    input()
    r=' '.join([m[i] for i in sorted([m.index(i) for i in input().split()])])
    print(f'#{t+1}\n{r}')