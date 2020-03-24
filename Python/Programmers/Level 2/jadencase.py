def solution(s):
    answer = ''
    li = []
    li.append(s[0].upper())
    print(answer)
    for i in range(1, len(s)):
        if s[i-1] == ' ':
            li.append(s[i].upper())
        else:
            li.append(s[i].lower())
    return ''.join(li)


print('answer', solution("3people  unFollowed me"))
