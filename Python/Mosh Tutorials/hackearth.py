num=int(input("number: "))
x=[]
l=1

for j in range(num):
    print("enter the number for array: ")
    elm=int(input())
    x.append(elm)
print("this  list contains: ",x)

for k in x:
    print(x*x)