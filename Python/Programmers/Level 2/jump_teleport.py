def solution(n):
    ans = 0
    while n > 0:
        if n % 2 == 0:
            n /= 2
        else:
            n -= 1
            ans += 1

    # return bin(n).count('1')
    return ans


print(solution(n=5000))
