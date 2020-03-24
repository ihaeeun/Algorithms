def solution(s):
    li = list(s)
    stack = 0

    if li[0] != '(':
        return False

    for i in li:
        stack -= 1 if i != '(' and stack > 0 else -1
        print(stack)

    return True if not stack else False

print(solution(s="()))((()"))
