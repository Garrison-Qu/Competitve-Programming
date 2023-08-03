import sys

def check (i):
    print(i)
    if i <= 11:
        return i
    else: 
        a = i % 10
        list = [int(x) for x in str(i)]
        list.pop(len(list)-1)
        i = magic(list) - a
        if i > 11:
            return check(i)
        elif i < 11:
            return i
    return 11

def magic(numList):         
    s = map(str, numList)  
    s = ''.join(s)          
    s = int(s)              
    return s
    
N = int(sys.stdin.readline())
for i in range (N):
    a = int(sys.stdin.readline())
    if check(a) == 11:
        print("The number " + str(a) + " is divisible by 11.")
    else:
        print("The number " + str(a) + " is not divisible by 11.")
    
