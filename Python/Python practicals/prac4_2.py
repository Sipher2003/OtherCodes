l=[]
x=int(input("Enter the number of elements for list: "))
for i in range(x):
    print("Enter element ",i+1,":",end=' ')
    element=input()
    l.append(element)
print("List before removing elements: ",l)
l.pop(5)
l.pop(4)
l.pop(2)
l.pop(0)
print("List after removing elements: ",l)
