def isCorrect(u):
    stack = 0
    for c in u:
        if c == '(':
            stack += 1
        else:
            if not stack:
                return False
            stack -= 1
    return True


def reverse(s):
    res = ''
    for c in s:
        if c == '(':
            res += ')'
        elif c == ')':
            res += '('
    return res


def recu(p):
    if not p:
        return ''

    for i in range(2, len(p), 2):
        if p[:i].count('(') == p[:i].count(')'):
            u = p[:i]
            v = p[i:]
            break
    else:
        u = p
        v = ''

    if isCorrect(u):
        return u + recu(v)
    else:
        result = '(' + recu(v) + ')' + reverse(u[1:-1])
        return result


def solution(p):
    return recu(p)