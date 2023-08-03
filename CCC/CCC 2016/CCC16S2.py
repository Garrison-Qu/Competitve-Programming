Q = int(input())
N = int(input())

Dmoj = list(map(int, input().split()))
Peg = list(map(int, input().split()))

counter = 0

if Q == 1:
    Dmoj.sort()
    Peg.sort()
    for i in range (N):
        counter += max(Dmoj[i], Peg[i])
else:
    Dmoj.sort()
    Peg.sort()
    Peg = Peg[::-1]
    for i in range (N):
        counter += max(Dmoj[i], Peg[i])

print(counter)
