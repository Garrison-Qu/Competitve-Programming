import sys
import math

input = sys.stdin.readline
output = sys.stdout.write

m = int(input())
n = int(input())

count = 0

for i in range (m):
    for j in range (n):
        if i+j > 8:
            break
        if i+j == 8:
            count += 1
if count == 1:
    print("There is " + str(count) + " way to get the sum 10.")
else:
    print("There are " + str(count) + " ways to get the sum 10.")