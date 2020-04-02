def recu(n, dp):
    if not dp[n]:
        return dp[n]
            
def solution(triangle):
    dp = [0 for i in range(2 ** (len(triangle)-1))]

    answer = max(dp)
    return answer


triangle = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
print(solution(triangle))
