def solution(N):
    dp = [0 for i in range(N+1)]
    dp[1] = 4

    edge = [0 for i in range(N+1)]
    edge[1] = 1

    for i in range(2, N+1):
        edge[i] = edge[i-2] + edge[i-1]
        dp[i] = dp[i - 1] + edge[i] * 2

    return dp[N]


print(solution(N=6))
