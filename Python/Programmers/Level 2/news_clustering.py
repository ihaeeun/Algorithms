from collections import Counter


def make_list(str):
    res = []
    for i in range(len(str) - 1):
        tmp = str[i:i+2]
        if tmp.isalpha():
            res.append(tmp)
    return res


def solution(str1, str2):
    li1 = make_list(str1.lower())
    li2 = make_list(str2.lower())
    print("li1:", li1)
    print("li2:", li2)
    # li1 = [str1[n:n+2].lower() for n in range(len(str1)-1) if str1[n:n+2].isalpha()]

    # if not (li1 and li2):
    if not li1 and not li2:
        return 1 * 65536

    lic1 = Counter(li1)
    lic2 = Counter(li2)
    print(list((lic1 & lic2).elements()))

    intersection = len(list((lic1 & lic2).elements()))
    union = len(li1) + len(li2) - intersection

    answer = int(intersection / union * 65536)
    return answer


str1 = "aa1+aa2"
str2 = "AAAA12"
print(solution(str1, str2))

# 5번만 통과가 안