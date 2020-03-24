def solution(n, words):
    answer = []
    participant = [[] for i in range(n)]
    li = []
    for i in range(len(words)):
        participant[(i + 1) % n].append(words[i])
    print(participant)

    for i in enumerate(words, 1):
        li.append(i)
        if li.count(i) > 1:
            print(i)
            idx = words.index(i) + 1
            answer.append(idx % n)
            answer.append(idx // n + 1)

    return answer


n = 3
words = ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
print(solution(n, words))
