N = int(input())

for i in range (N):
    st = input()
    counter = 0
    prev = st[0]
    for c in st:
        if c == prev:
            counter += 1
        else:
            print(str(counter) + " " + prev + " ", end = "")
            prev = c
            counter = 1
    print(str(counter) + " " + prev + " ", end = "")
    print()