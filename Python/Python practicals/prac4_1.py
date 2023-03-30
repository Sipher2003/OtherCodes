list1=[]
x=int(input("Enter the number of elements for list 1: "))
for i in range(x):
    print("Enter element ",i+1,":",end=' ')
    element=input()
    list1.append(element)
print("List1 contains: ",list1)


list2=[]
y=int(input("Enter the number of elements for list 2: "))
for j in range(y):
    print("Enter element ",j+1,":",end=' ')
    element2=input()
    list2.append(element2)
print("List2 contains: ",list2)

def chkcommon(list1,list2):
    for a in list1:
        if a in list2:
            return True
    return False

if(chkcommon(list1,list2)):
    print("Elements in common")
else:
    print("Elements are not common")