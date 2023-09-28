s = []
s.append(int(input()))
s.append(int(input()))

count = 3

while s[0] - s[1] <= s[1]:
    count += 1
    s.append(s[0] - s[1])
    s.pop(0)
    
print(count)