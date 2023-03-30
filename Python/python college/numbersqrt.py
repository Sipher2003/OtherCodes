import math
ch='y'
while(ch=='y' or ch=='Y'):
    num=int(input("Enter the number: "))
    x=math.sqrt(num)
    print(f"the square root of the number {num} is ",x)
    ch=input("Do you wish to continue: ")
else:
    print("The operation is over")

