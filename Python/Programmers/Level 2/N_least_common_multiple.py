def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)


def gcm(a, b):
    return a * b // gcd(a, b)


def solution(arr):
    lcm = arr[0]

    for i in arr:
        lcm = gcm(lcm, i)

    return lcm


arr= [2, 6, 8, 14]
print(solution(arr))
