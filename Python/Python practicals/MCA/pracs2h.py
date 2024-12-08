#palindrome

num=input("Enter a number")

# temp=num
# rev=0

# while num>0:
#     digit=num%10
#     rev=(rev*10)+digit
#     num//=10
# if(temp==rev):
#     print("pal")
# else:
#     print("not")


rev=num[::-1]
if(num==rev):
    print("pal")
else:
    print("not")


# ::-1