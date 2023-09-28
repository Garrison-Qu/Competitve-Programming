import sys
import math

input = sys.stdin.readline
output = sys.stdout.write

count = 0
burger = [461, 431, 420, 0]
sides = [100, 57, 70, 0]
drink = [130, 160, 118, 0]
dessert = [167, 266, 75, 0]

N = int(input())
count += burger[N-1]
N = int(input())
count += sides[N-1]
N = int(input())
count += drink[N-1]
N = int(input())
count += dessert[N-1]

print("Your total Calorie count is " + str(count) + ".")