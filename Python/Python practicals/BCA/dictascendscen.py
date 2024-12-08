dict1 = dict()
no = int(input("How many key values do u wish to have: "))

for i in range(no):
    data = input("Enter player name & goals scored :")
    temp = data.split(":")
    dict1[temp[0]] = int(temp[1])

print("Original dict : ", dict1)
print("Ascending order : ", sorted(dict1.values()))
print("Descending order : ", sorted(dict1.values(), reverse=True))

