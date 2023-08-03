import sys

t = 0
s = 0

N = int(sys.stdin.readline())
for i in range (N):
    input = sys.stdin.readline()
    t += input.count('T')
    t += input.count('t')
    s += input.count('S')
    s += input.count('s')
    
if s >= t:
    sys.stdout.write('French')
else:
    sys.stdout.write('English')
