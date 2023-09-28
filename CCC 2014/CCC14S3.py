import sys
import math

input = sys.stdin.readline
output = sys.stdout.write

for i in range(0,int(input())):
    mountain, branch = [], []
    wanted = 1
    
    for i in range(0,int(input())):
        mountain.append(int(input()))
    mountain = mountain[::-1]

    for elem in mountain:
        if elem == wanted:
            wanted+=1
        else:
            branch.append(elem)
        for i in range(0, len(branch)):
            if branch[-1] == wanted:
                branch.pop()
                wanted += 1
            else:
                break
            
    if branch == []:
        print('Y')
    else:
        print('N')