def con_dict(pract_dict,pract_dict2):
    pract_dict3=pract_dict.copy()
    pract_dict3.update(pract_dict2)
    return pract_dict3


pract_dict={}
num=int(input("How many values of key pairs do you want: "))

for i in range(num):
    data=input("enter the name of fruit and its value separating by a ':' ")
    temp=data.split(":")
    pract_dict[temp[0]]=int(temp[1])


pract_dict2={}
num2=int(input("How many values of key pairs do you want: "))

for j in range(num2):
    data2=input("enter the name of fruit and its value separating by a ':' ")
    temp2=data2.split(":")
    pract_dict2[temp2[0]]=int(temp2[1])



print(con_dict(pract_dict,pract_dict2))