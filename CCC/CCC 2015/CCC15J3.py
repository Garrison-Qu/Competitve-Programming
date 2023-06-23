import string

alphabet = list(string.ascii_lowercase)

word = str(input())
output = []

for i in range (len(word)):
    print(word[i], end ="")
    if not (word[i] == "a" or word[i] == "e" or word[i] == "i" or word[i] == "o" or word[i] == "u"):
        if alphabet.index(word[i]) <= 2:
            print("a", end ="")
        elif alphabet.index(word[i]) <= 6:
            print("e", end ="")
        elif alphabet.index(word[i]) <= 11:
            print("i", end ="")
        elif alphabet.index(word[i]) <= 17:
            print("o", end ="")
        else: 
            print("u", end ="")
        if word[i] == "z":
            print("z", end ="")
        elif alphabet[alphabet.index(word[i]) + 1] == "a" or alphabet[alphabet.index(word[i]) + 1] == "e" or alphabet[alphabet.index(word[i]) + 1] == "i" or alphabet[alphabet.index(word[i]) + 1] == "o" or alphabet[alphabet.index(word[i]) + 1] == "u":
            print(alphabet[alphabet.index(word[i]) + 2], end ="")
        else: 
            print(alphabet[alphabet.index(word[i]) + 1], end ="")