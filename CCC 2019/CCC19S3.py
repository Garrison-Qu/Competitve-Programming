import sys
input = sys.stdin.readline

matrix = []
for i in range (3): 
    matrix.append(list(map(str, input().split())))

X_count = 0
for i in range (3):
    for j in range (3):
        if matrix[i][j] == 'X':
            X_count += 1


    

