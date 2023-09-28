h = int(input())
M = int(input())

landed = False
for t in range (1, M):
    A = -6*pow(t, 4)+h*pow(t, 3)+2*pow(t, 2)+t
    if A <= 0:
        print("The balloon first touches ground at hour:")
        print(t)
        landed = True
        break
    
if not landed:
    print("The balloon does not touch ground in the given time.")