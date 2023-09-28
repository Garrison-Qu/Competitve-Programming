N = int(input())
list = []

for i in range (N):
    list.append(int(input()))
    
max = 0
min = 100
maxList = []
minList = []

for i in list:
    a = list.count(i)
    if max < a:
        max = a
    if min > a:
        min = a

def find(element, lst):
    for i in range(len(lst)-1):
        if element == lst[i]:
            return 0
    return -1

for i in list:
    if list.count(i) == max and find(i, maxList) == -1:
        maxList.append(i)
    if list.count(i) == min and find(i, minList) == -1:
        minList.append(i)

maxList.sort()
minList.sort()

out = abs(maxList[0] - minList[len(minList)-1])
if abs(maxList[len(maxList)-1] - minList[0]) > out:
    print(abs(maxList[len(maxList)-1] - minList[0]))
else:
    print(out)