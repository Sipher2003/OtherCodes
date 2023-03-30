pract_dict={}
num=int(input("How many values of key pairs do you want: "))

for i in range(num):
    data=input("enter the name of fruit and its value separating by a ':' ")
    temp=data.split(":")
    pract_dict[temp[0]]=int(temp[1])

print(f"Original dictionary is {pract_dict}")

sorted_values=sorted(pract_dict.values())
sorted_values2=sorted(pract_dict.values(),reverse=True)

print(f"Dictionary values in ascending order{sorted_values}")
print(f"Dictionary values in ascending order{sorted_values2}")


