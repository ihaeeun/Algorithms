for t in range(int(input())):
    h, w = map(int, input().split())
    game_map = []
    for _ in range(h):
        game_map.append(list(input()))

    n = int(input())
    command = list(input())


    x, y = 0, 0
    direction = ''
    #init tank
    for i in range(len(game_map)):
        for j in range(len(game_map[i])):
            if game_map[i][j] == '^':
                direction = '^'
                x, y = i, j
            elif game_map[i][j] == 'v':
                direction = 'v'
                x, y = i, j

            elif game_map[i][j] == '<':
                direction = '<'
                x, y = i, j

            elif game_map[i][j] == '>':
                direction = '>'
                x, y = i, j


    for i in command:
        print(i)
        if i == "U":
            direction = '^'
            if x-1 >= 0 and game_map[x-1][y] == '.':
                game_map[x][y] = '.'
                x = x-1
                game_map[x][y] = direction
            else:
                game_map[x][y] = direction

        elif i == "D":
            direction = 'v'
            if x+1 < h and game_map[x+1][y] == '.':
                game_map[x][y] = '.'
                x = x+1
                game_map[x][y] = direction
            else:
                game_map[x][y] = direction

        elif i == "L":
            direction = '<'
            if y-1 >= 0 and game_map[x][y-1] == '.':
                game_map[x][y] = '.'
                y = y-1
                game_map[x][y] = direction
            else:
                game_map[x][y] = direction

        elif i == "R":
            direction = '>'
            if y+1 < w and game_map[x][y+1] == '.':
                game_map[x][y] = '.'
                y = y+1
                game_map[x][y] = direction
            else:
                game_map[x][y] = direction

        elif i == "S":
            if direction == '^':
                for j in range(x-1, -1, -1):
                    if game_map[j][y] == '*':
                        game_map[j][y] = '.'
                        break
                    elif game_map[j][y] == '#':
                        break
            elif direction == 'v':
                for j in range(x+1, h):
                    if game_map[j][y] == '*':
                        game_map[j][y] = '.'
                        break
                    elif game_map[j][y] == '#':
                        break

            elif direction == '>':
                for j in range(y+1, w):
                    if game_map[x][j] == '*':
                        game_map[x][j] = '.'
                        break
                    elif game_map[x][j] == '#':
                        break

            elif direction == '<':
                for j in range(y-1, -1, -1):
                    if game_map[x][j] == '*':
                        game_map[x][j] = '.'
                        break
                    elif game_map[x][j] == '#':
                        break
        for game in game_map:
            print(''.join(game))
        print('-'*30)

    print(f'#{t + 1}', end=' ')
    for game in game_map:
        print(''.join(game))