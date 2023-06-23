import sys

input = sys.stdin.readline()

counter = 0

l = input.count('L')
m = input.count('M')
s = input.count('S')

#while s[0] == 'L':
#    s.replace('L', '', 1)
#else: 
#    if s[0] == 'M':
#        if s.count('L') > 0:
#            counter += 1
#            s.replace('M', '', 1)
#            s.replace('L', '', 1)
#        else:
#            while s[0] == 'M':
#                s.replace('M', '', 1)
#            else:

#while len(s) > 0:
#    if s[0] == 'L':
#        s.replace('L', '', 1)
#    elif s[0] == 'M':
#        if s.count('L') > 0:
#            counter += 1
#            s.replace('L', '', 1)
#            s.replace('M', '', 1)
#        else:
#            s.replace('M', '', 1)
#    elif s[0] == 'S':
#        if s.count('L') > 0:
#           counter += 1
#            s.replace('S', '', 1)
#            s.replace('L', '', 1)
#        if s.count('M') > 0:
#            counter += 1
#            s.replace('S', '', 1)
#            s.replace('M', '', 1)
    
sys.stdout.write(counter)