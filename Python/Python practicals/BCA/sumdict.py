dict1=dict() 

no=int(input("How many key values pair do you wish to enter?: "))
for i in range(no):
    data=input("Enter vehicle and number of wheels: ")
    tempInp=data.split(":")
    dict1[tempInp[0]]=int(tempInp[1])
sum=0

for x in dict1.values():
    sum=sum+x
print("Total no of wheels: ",sum)
