list = []
for i in range (4):
    list.append(int(input()))

if list[3] > list[2] and list[2] > list[1] and list[1] > list[0]:
    print("Fish Rising")
elif list[3] < list[2] and list[2] < list[1] and list[1] < list[0]:
    print("Fish Diving")
elif list[3] == list[2] and list[2] == list[1] and list[1] == list[0]:
    print("Fish At Constant Depth")
else:
    print("No Fish")