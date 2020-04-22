def solution(m, n, board):
    answer = 0
    for i in range(m):
        board[i] = list(board[i])
    print(board)
    while True:
        check = [[0 for _ in range(n)] for _ in range(m)]
        for i in range(m - 1):
            for j in range(n - 1):
                if board[i][j] == board[i + 1][j] == board[i][j + 1] == board[i + 1][j + 1] != 0:
                    check[i][j] = check[i + 1][j] = check[i][j + 1] = check[i + 1][j + 1] = 1
        print(check, sum([sum(i) for i in check]))

        if not sum([sum(i) for i in check]):
            break

        for i in range(m):
            for j in range(n):
                if check[i][j]:
                    board[i][j] = 0
        print(board)

        for j in range(n - 1, -1, -1):
            for i in range(m - 1, -1, -1):
                if not board[i][j]:
                    for k in range(i - 1, -1, -1):
                        if board[k][j]:
                            board[i][j], board[k][j] = board[k][j], board[i][j]
                            break
        print(board,'\n')
        answer += sum([sum(i) for i in check])

    return answer


m = 6
n = 6
board = ["TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"]
print(solution(m, n, board))
