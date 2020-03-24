def message(user):
    global users
    if user[1] == "Enter":
        return "{}님이 들어왔습니다.".format(users[user[0]])
    else:
        return "{}님이 나갔습니다.".format(users[user[0]])


users = {}


def solution(record):
    global users
    answer = []
    stack = []

    for i in record:
        msg = i.split()
        if msg[0] == "Enter":
            users[msg[1]] = msg[2]
            stack.append((msg[1], msg[0]))
        elif msg[0] == "Leave":
            stack.append((msg[1], msg[0]))
        elif msg[0] == "Change":
            users[msg[1]] = msg[2]
    print(users)
    print(stack)
    for i in stack:
        answer.append(message(i))

    return answer


record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
print(solution(record))
