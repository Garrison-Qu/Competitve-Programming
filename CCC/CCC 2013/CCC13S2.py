import sys

limit = int(sys.stdin.readline())
N = int(sys.stdin.readline())
cars = []
for i in range (N):
    cars.append(int(sys.stdin.readline()))
    
out = 0

if cars[0] <= limit:
    out = 1
    if N > 1:
        if cars[0] + cars[1] <= limit:
            out = 2
            if N > 2:
                if cars[0] + cars[1] + cars[2] <= limit:
                    out = 3

for i in range (3, N-1):
    if cars[i-3] + cars[i-2] + cars[i-1] + cars[i] <= limit:
        out = i+1
    else: 
        break

if out == 99999:
    out += 1
    
sys.stdout.write(str(out))