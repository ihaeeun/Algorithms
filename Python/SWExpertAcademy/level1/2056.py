T = int(input())
month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

for test_case in range(T):
    date = input()
    tmp = [date[:4], date[4:6], date[-2:]]
    # print(tmp)
    if not 0 < int(tmp[1]) < 13 or not 0 < int(tmp[2]) <= month[int(tmp[1])-1]:
        print('#', test_case+1, ' -1', sep='')
    else:
        # answer = tmp[0]+'/'+tmp[1]+'/'+tmp[2]
        print('#', test_case+1, ' ', tmp[0], '/', tmp[1], '/', tmp[2], sep='')
