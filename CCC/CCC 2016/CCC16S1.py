import sys

line1 = sys.stdin.readline()
line2 = sys.stdin.readline()

ast = line2.count('*')

checked = []

m = False

for i in line1:
    if checked.count(i) == 0:
        checked.append(i)
        if line2.count(i) > line1.count(i):
            m = True
            break
        ast -= (line1.count(i) - line2.count(i))
        if ast < 0:
            m = True
            break

if m == True:
    print('N')
else:
    print('A')