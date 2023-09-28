import string

alphabets = list(string.ascii_lowercase)
press = [2, 22, 222, 3, 33, 333, 4, 44, 444, 5, 55, 555, 6, 66, 666, 7, 77, 777, 7777, 8, 88, 888, 9, 99, 999, 9999]

l = input()

while l != 'halt':
    output = 0
    prev = 0
    for i in l:
        a = press[alphabets.index(i)]
        if a%10 == prev%10:
            output += 2
            output += len(str(a))
        else:
            output += len(str(a))
        prev = a
    l = input()
    print(output)
    