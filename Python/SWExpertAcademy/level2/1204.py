from collections import Counter

t = int(input())
# li = list(map(int, input().split()))
# print(Counter(li).most_common()[0][0])
print("#%d %d" %(t, Counter(list(map(int, input().split()))).most_common()[0][0]))