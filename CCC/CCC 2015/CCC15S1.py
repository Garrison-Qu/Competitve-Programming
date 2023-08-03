import sys

N = int(sys.stdin.readline())
arr = []

for i in range (N):
    input = int(sys.stdin.readline())
    if (input != 0):
        arr.append(input)
    else: 
        arr.pop()

counter = 0

for i in arr:
    counter += i
    
sys.stdout.write(str(counter))
    