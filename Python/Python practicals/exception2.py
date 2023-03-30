# #Zero divison error 
n=int(input("enter a number: "))
try:
     print(n / 0)
except ZeroDivisionError:
     print("an error occurs")



# # Index error example  
a=[1,2,3]
try:
    print(a[3])
except IndexError:
    print("An indexerror occured")


# #Name error example
try:
    print(b)
except NameError:
    print("A name error has occured")


# Key error example 
try:
    myDict = {1: 1, 2: 4, 3: 9}
    print("The dictionary is:", myDict)
    print(myDict[4])
    
except KeyError:
    print("A key error has occured")
