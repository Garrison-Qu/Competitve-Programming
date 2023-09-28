n = int(input())

list1 = input().split()
list2 = input().split()

output = True

for i in range (len(list1)):
    partner = list2[i]
    if list1[i] != list2[list1.index(partner)] or list1[i] == list2[i]:
        output = False
        
if output:
    print("good")
else:
    print("bad")