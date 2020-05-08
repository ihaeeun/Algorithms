def solution(s):
    answer = len(s)

    # n//2개 까지만 검사
    for i in range(1, len(s)//2+1):
        chunks =[s[j:j+i] for j in range(0, len(s), i)]
        compression = ""
        cnt = 1
        for k in range(len(chunks)-1):
            if chunks[k] == chunks[k+1]:
                cnt+=1
            else:
                compression += str(cnt) + chunks[k - 1] if cnt > 1 else chunks[k]
                cnt = 1

            if k+1 == len(chunks)-1:
                compression += str(cnt) + chunks[k] if cnt > 1 else chunks[k+1]

        answer = len(compression) if len(compression) < answer else answer


    return answer


s = "ababcdcdababcdcd"
print(solution(s))