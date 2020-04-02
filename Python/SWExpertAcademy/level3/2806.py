answer = 0
def recu(v, n, board):
    global answer
    if v == n:
        answer += 1
        return
    for i in range(n):
        flag = 1
        for j in range(v):
            if board[j]==i or abs(v-j)==abs(i-board[j]):
                flag = 0
                break
        if flag:
            board[v] = i
            recu(v+1, n, board)

for t in range(int(input())):
    n = int(input())
    answer = 0
    if not n == 2 or not n == 3:
        board = [0 for i in range(n)]
        recu(0, n, board)
    print(f'#{t+1}', answer)





### 4-Queens 문제
# 1. 4*4 정사각형 안에 네 개의 퀸에 대한 위치를 하나씩 선택
# 2. 첫 번째 퀸을 1행 1열에 놓고, 2행에 두 번째 퀸 놓기
# 3. 2행 1열과 2행 2열에 퀸을 두면 1행 1열에 있는 첫 번째 퀸과 서로 위협하므로 놓을 수 없음
# 4. 2행 3열에 두 번째 퀸을 놓게 되면 첫 번째 퀸과 서로 위협하지 않음
# 5. 세 번째 퀸을 3행 어디에 놓더라도 서로 위협하게 됨
# 6. 네 번째 퀸의 위치와 무관하게 답이 될 수 없음
# 7. 이전에 선택했던 두 번째 퀸의 위치를 4열에 놓음
# 8. 세 번째 퀸은 2열에 둠
# 9. 네 번째 퀸은 둘 곳이 없음
# 10. 세 번째 퀸을 다른 곳으로 옮겨도 안됨
# 11. 두 번째 퀸의 위치를 변경해야 하지만 이미 4열이므로 변경 불가
# 12. 첫 번째 퀸의 위치를 2열로 변경

'''
def checknode(v):                       # 현재 방문하는 노드
    if promisint(v):                    # 현재 방문하는 노드의 유망성 점검 후 유망하지 않은 경우 재귀 호출하지 않고 종료
        if there is a solution at v:    # 단말 노드에 도착하면 찾으려는 해인지 검사
            write the solution          # 찾은 해 출력
        else:                           # 단말노드가 아니라면
            for u in each child of v:   # 모든 자식 노드를 방문하기 위해 재귀호출
                checknoe(u)
'''