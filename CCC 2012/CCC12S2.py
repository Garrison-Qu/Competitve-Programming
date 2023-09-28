line = input()

RList = ['I', 'V', 'X', 'L', 'C', 'D', 'M']
AList = [1, 5, 10, 50, 100, 500, 1000]

prevR = 0
prevADD = 0
counter = 0

for i in range (int(len(line)/2)):
    N = int(line[2*i])
    R = int(AList[RList.index(line[2*i+1])])
    if R > prevR:
        counter -= 2*prevADD
    prevR = R
    counter += N*R
    prevADD = N*R

print(counter)