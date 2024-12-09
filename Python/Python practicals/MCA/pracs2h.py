#palindrome

num=int(input("Enter a number"))

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


# rev=num[::-1]
# if(num==rev):
#     print("pal")
# else:
#     print("not")


temp=num
rev=0

while temp>0:
    digit=temp%10
    rev=(rev*10)+digit
    temp//=10
if(rev==num):
    print("palind")
else:
    print("nope")


# ::-1