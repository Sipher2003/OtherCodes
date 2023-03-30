num=input("enter the mobile number: ")

if(len(num)==10 and num.isnumeric()):
    print("It is a valid mobile number")
else:
    print("It is not")