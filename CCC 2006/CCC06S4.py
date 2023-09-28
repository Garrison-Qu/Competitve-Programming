import sys
input = sys.stdin.readline

while True:
    N = int(input())
    output = True
    if N == 0:
        break
    matrix = []
    for i in range (N):
        line = list(map(int, input().split()))
        matrix.append(line)
    for i in range (N):
        line = []
        for j in range (N):
            line.append(matrix[i][j])
            if (line.count(matrix[i][j]) != 1):
                #print(line)
                output = False
    for i in range (N):
        line = []
        for j in range (N):
            line.append(matrix[j][i])
            if (line.count(matrix[j][i]) != 1):
                #print(line)
                output = False
    if output:
        print("yes")
    else:
        print("no")