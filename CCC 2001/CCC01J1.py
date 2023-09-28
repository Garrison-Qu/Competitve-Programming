import sys

input = sys.stdin.readline

N = int(input())

for i in range (N):
    list = []
    for j in range (2*N):
        if j < 2*i+1 or j > 2*N-2*i-1:
            list.append('*')
        else:
            list.append(' ')
    for e in list:
        print(e, end = "")
print()