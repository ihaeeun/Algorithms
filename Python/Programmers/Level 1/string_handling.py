def solution(s):
    if len(s) != (4 or 6):
        print(len(s))
        return False
    for i in s:
        if i.isalpha():
            return False

    return True


print(solution('1234'))