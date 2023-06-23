letters = ["I", "O", "S", "H", "Z", "X", "N"]
line = str(input())
out = True
x = len(line)

for i in range (x):
    if line[i] not in letters:
        out = False
        break
    
if out == True:
    print("YES")
else:
    print("NO")