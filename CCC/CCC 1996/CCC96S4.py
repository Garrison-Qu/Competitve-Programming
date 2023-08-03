N = int(input())

line = []

def numToRoman(data):
    roman_list1 = ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX']
    roman_list2 = ['X', 'XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC']
    roman_list3 = ['C', 'CC', 'CCC', 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM']
    if 0 < data < 10:
        roman = roman_list1[data - 1]
        return roman
    elif 10 <= data < 100:
        if data % 10 == 0:
            roman = roman_list2[data // 10 - 1]
        else:
            roman = roman_list2[data // 10 - 1] + numToRoman(data % 10)
        return roman
    elif 100 <= data < 1000:
        if data % 100 == 0:
            roman = roman_list3[data // 100 - 1]
        else:
            roman = roman_list3[data // 100 - 1] + numToRoman(data % 100)
        return roman
    elif 1000 <= data < 9999:
        if data % 1000 == 0:
            roman = 'M' * (data // 1000)
        else:
            roman = 'M' * (data // 1000) + numToRoman(data % 1000)
        return roman
    
def romanToInt(s):
    special_dict = {
        'IV':4, 'IX':9, 'XL':40, \
        'XC':90, 'CD':400, 'CM':900 \
    }
    ornarate_dict = {
        'I':1, 'V':5, 'X':10, \
        'L':50, 'C':100, 'D':500, \
        'M':1000 \
    }
    tmp_sum = []
        
    if len(s) == 2 and s in special_dict:
        return special_dict[s]
        
    if len(s) == 2 and s not in special_dict:
        return (ornarate_dict[s[0]] + ornarate_dict[s[1]])
            
    if len(s) == 1 :
        return ornarate_dict[s]
    
    if len(s) > 2:
        for keys in special_dict.keys():
            if keys in s:
                tmp_sum.append(special_dict[keys])
                s = s.replace(keys, '')

        for i in s:
            tmp_sum.append(ornarate_dict[i])

        return sum(tmp_sum)
        
for i in range (N):
    line = input()
    pos = line.find('+')
    num1 = romanToInt(line[0:pos:1])
    num2 = romanToInt(line[pos+1:len(line)-1:1])
    sum = num1 + num2
    if sum > 1000:
        print(line + '=CONCORDIA CUM VERITATE')
    else:
        print(line + '=' + numToRoman(sum))
    