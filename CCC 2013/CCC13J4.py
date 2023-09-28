T = int(input())
C = int(input())

task = []
count = 0

for i in range (C):
    task.append(int(input()))

task.sort()

while T > 0:
    if T >= task[0]:
        T -= task[0]
        task.pop(0)
        count += 1
    else:
        T = 0

print(count)