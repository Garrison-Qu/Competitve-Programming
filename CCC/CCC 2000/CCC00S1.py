num = int(input())
g1 = int(input())
g2 = int(input())
g3 = int(input())
count = 0

while num > 0:
    num -= 1
    g1 += 1
    count += 1
    if g1 == 35:
        g1 = 0
        num += 30
    if num > 0:
        num -= 1
        g2 += 1
        count += 1
        if g2 == 100:
            g2 = 0
            num += 60
        if num > 0:
            num -= 1
            g3 += 1
            count += 1
            if g3 == 10:
                g3 = 0
                num += 9

print('Martha plays ' + str(count) + ' times before going broke.')
