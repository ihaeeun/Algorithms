def remove(arr):
    li = [arr[0]]
    for i in range(len(arr)-1):
        if arr[i] == arr[i+1]:
            li.pop()
        else:
            li.append(arr[i+1])
    return li


def solution(s):
    arr = list(s)
    pre_len = len(s)
    mid = remove(arr)
    post_len = len(mid)

    while pre_len != post_len:
        pre_len = post_len
        mid = remove(mid)
        if not mid:
            return 1
        post_len = len(mid)

    return 0


# s = "baabaa"
s = "cdcd"
print(solution(s))