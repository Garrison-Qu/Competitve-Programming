n = int(input())

list = []
count = 0

for i in range (n):
    list.append(input())

for i in range (n):
    if input() == list[i]:
        count += 1
    
print(count)