list = list(map(int, input().split(':')))
time = 60*list[0] + list[1]

dist = 240

while dist > 0:
    if ((420 <= time) and (time < 600)) or ((900 <= time) and (time <= 1140)):
        dist -= 1
    else:
        dist -= 2
    time += 1

min = time%60
if min == 11:
    min = 10
elif min == 41:
    min = 40
elif min == 51:
    min = 50
if min < 10:
    min = "0" + str(min)
hr = int(time/60)%24
if hr < 10:
    hr = "0" + str(hr)
    

print(str(hr) + ":" + str(min))