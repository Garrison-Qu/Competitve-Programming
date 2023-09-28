import sys
input = sys.stdin.readline

rules = [[1, 7], [1, 4], [2, 1], [3, 4], [3, 5]]
i = int(input())
j = int(input())

while i != j:
    rules.append([i, j])
    i = int(input())
    j = int(input())

def check(l):
    for i in range (len(rules)):
        pos1 = list.index(rules[i][0])
        pos2 = list.index(rules[i][1])
        if (pos1 > pos2):
            return False
    return True

def distinct(l):
    for i in l:
        if l.count(i) > 1:
            return False
    return True

output = False
for a in range (1, 8):
    for b in range (1, 8):
        for c in range (1, 8):
            for d in range (1, 8):
                for e in range (1, 8):
                    for f in range (1, 8):
                        for g in range (1, 8):
                            list = [a, b, c, d, e, f, g]
                            if distinct(list):
                                if check(list) and not output:
                                    for i in list:
                                        print(str(i) + " ", end = "")
                                        output = True
                                        
if not output:
    print("Cannot complete these tasks. Going to bed.")