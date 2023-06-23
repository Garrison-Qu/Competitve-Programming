l1 = int(input())
l2 = int(input())
l3 = int(input())
sum = l1+l2+l3

if sum > 180 or sum < 180:
    print("Error")
elif l1 == 60 and l2 == 60:
    print("Equilateral")
elif l1 == l2 or l2 == l3 or l1 == l3:
    print("Isosceles")
else:   
    print("Scalene")
