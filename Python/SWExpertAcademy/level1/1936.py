A, B = map(int, input().split())

if A != 2 and B != 2:
    A %= 3
    B %= 3

print(A, B)
answer = 'A' if A > B else 'B'
print(answer)
