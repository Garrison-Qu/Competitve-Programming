num = int(input())

loc = []
min = 2e9

for i in range (num):
    loc.append(int(input()))
    loc.sort()
    
for i in range (1, num-1):
    left = (abs(float(loc[i] - loc[i-1])))/2
    right = (abs(float(loc[i+1] - loc[i])))/2
    if left + right < min:
        min = left + right 
    
print(min)