import math

y = int(input())

def check(year):
    if year >= 1000:
        a = math.floor(year%10)
        year = year/10
        b = math.floor(year%10)
        year = year/10
        c = math.floor(year%10)
        year = year/10
        d = math.floor(year%10)
        if a == b or b == c or c == d or a == c or a == d or b == d:
            return False
        else:
            return True
    elif year >= 100:
        a = math.floor(year%10)
        year = year/10
        b = math.floor(year%10)
        year = year/10
        c = math.floor(year%10)
        year = year/10
        if a == b or b == c or a == c:
            return False
        else:
            return True
    elif year >= 10:
        a = math.floor(year%10)
        year = year/10
        b = math.floor(year%10)
        year = year/10
        if a == b:
            return False
        else:
            return True
    else:
        return True
        
for i in range (y+1, 10001):
    if check(i) == True:
        print(i)
        break