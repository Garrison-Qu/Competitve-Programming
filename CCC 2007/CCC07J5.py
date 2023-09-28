import sys

input = sys.stdin.readline

motel = [0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000]
dp = []

A, B, N = int(input()), int(input()), int(input())

for i in range (N):
    motel.append(int(input()))

for i in range (len(motel)):
    dp.append(0)
dp[0] = 1
        
motel.sort()

for i in range (len(motel)):
    for j in range (i):
        if motel[i] - motel[j] <= B and motel[i] - motel[j] >= A:
            dp[i] += dp[j]

print(dp[-1])