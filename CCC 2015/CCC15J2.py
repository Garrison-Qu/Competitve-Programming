line = str(input())

happy = 0
sad = 0

for i in range (len(line)-2):
    if line[i] == ":" and line[i+1] == "-": 
        if line[i+2] == ")":
            happy += 1
        elif line[i+2] == "(":
            sad += 1

if happy == 0 and sad == 0:
    print("none")
elif happy > sad: 
    print("happy") 
elif sad > happy: 
    print("sad")
else:
    print("unsure")

    