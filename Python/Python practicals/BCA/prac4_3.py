l=[]
x=int(input("Enter the number of elements for list: "))
for i in range(x):
    print("Enter element ",i+1,":",end=' ')
    element=input()
    l.append(element)
print("Original list: ",l)


def copy_list():
    l2=l.copy()
    l.append(1)
    print("Original list after append ",l)
    print("Copied list is ",l2)

copy_list()