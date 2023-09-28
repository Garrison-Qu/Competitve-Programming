import sys
import math

N, T = map(int, sys.stdin.readline().split())
c = sys.stdin.readline()

def shift (t):
    new = ''
    for i in range (N):
        new = new + str(int(c[(i - t) % N]) ^ int(c[(i + t) % N]))
    return new

for i in range(60, -1, -1):
    if (T >> i) & 1:
        c = shift(1 << i)
        
sys.stdout.write(c)