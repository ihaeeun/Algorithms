def solution(phone_number):
    return '*' * (len(phone_number) - 4) + phone_number[-4:]


phone_number = '02777888'
print(solution(phone_number))