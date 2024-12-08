pract_dict={}
num=int(input("How many values of key pairs do you want: "))
sum=0

for i in range(num):
    data=input("enter the name of fruit and its value separating by a ':' ")
    temp=data.split(":")
    pract_dict[temp[0]]=int(temp[1])

print(f"Original dictionary is {pract_dict}")

for x in pract_dict.values():
    sum=sum+x

print(f"The sum of the values of the dictionary is {sum}")
