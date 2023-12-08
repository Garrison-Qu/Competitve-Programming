import math
N = int(input())
sum = 0
_ = 1
while _ < N**0.5:
    sum += N//_
    _ += 1

for i in range (1, int(N**0.5)+1):
    sum += i*(N//i-N//(i+1))

if int(N**0.5)**2+int(N**0.5) > N > int(N**0.5)**2:
    print(sum-int(N**0.5))
else:
    print(sum)
