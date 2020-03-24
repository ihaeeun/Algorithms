import re
a=[str(i) for i in range(1, int(input())+1)]
for i in a:
    if i.find('3'):i.replace(i, '-')
print(a)
print(re.sub('3|6|9', '-', a))