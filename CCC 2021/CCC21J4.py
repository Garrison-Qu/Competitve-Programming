import sys
import math

input = sys.stdin.readline()

counter = 0

l = input.count('L')
m = input.count('M')
s = input.count('S')

lm, ls, ml, ms, sl, sm = 0, 0, 0, 0, 0, 0

for i in range (l):
    if input[i] == 'M':
        lm += 1
    if input[i] == 'S':
        ls += 1

for i in range (m):
    if input[l+i] == 'L':
        ml += 1
    if input[l+i] == 'S':
        ms += 1

for i in range (s):
    if input[l+m+i] == 'L':
        sl += 1
    if input[l+m+i] == 'M':
        sm += 1

counter = lm + ls + ml + ms - min(ml, lm)

print(int(counter))