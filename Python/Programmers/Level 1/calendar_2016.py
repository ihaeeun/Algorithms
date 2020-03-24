import calendar

def solution(a, b):
    return ["MON", "TUE", "WED", "THU","FRI", "SAT", "SUN"][calendar.weekday(2016, a, b)]


print(solution(a=5, b=24))
