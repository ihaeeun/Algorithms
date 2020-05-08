from collections import defaultdict

def dfs(visit):
    if dp[visit]:
        return dp[visit]

    if visit == (2**n)-1:
        # print(bin(2 ** n - 1), "ddddddd")
        return 1
    res = 0


    for i in range(n):
        if (2**i) == visit & (2**i):
            continue
        if arr[i] & visit == arr[i]:
            # print(bin(visit+(2**i)), i)
            res += dfs(visit+(2**i))
    dp[visit] = res


    return res

for t in range(int(input())):
    n, m = map(int, input().split())
    arr = [0 for i in range(n)]
    # print(arr)
    for i in range(m):
        x, y = map(int, input().split())
        arr[y-1] += 2 ** (x-1)
    dp = defaultdict(int)
    # print(arr)

    answer = dfs(0)
    print(answer)