dict1 = dict()
no1 = int(input("How many key values do u wish to have in dict 1: "))

for i in range(no1):
    data1 = input("Enter dict1 key & values :")
    temp1 = data1.split(":")
    dict1[temp1[0]] = int(temp1[1])

dict2 = dict()
no2 = int(input("How many key values do u wish to have in dict 2: "))

for i in range(no2):
    data2 = input("Enter dict2 key & values :")
    temp2 = data2.split(":")
    dict2[temp2[0]] = int(temp2[1])

dict3 = {}
for d in (dict1, dict2):
     dict3.update(d)
print(dict3)
