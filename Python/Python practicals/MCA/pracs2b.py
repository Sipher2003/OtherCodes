# number=int(input("Ener the number: "))
# length=len(str(number))


# temp=number
# sum=0
# while temp>0:
#     digit=temp%10
#     sum+=digit**length
#     temp=temp//10

# if(sum==number):
#     print(f"{number} is an armstrong number")
# else:
#     print(f"{number} is not an armstrong number")



num=int(input("Enter a number: "))
lenth=len(str(num))

temp=num
sum=0

while temp>0:
    digit=temp%10
    sum+=digit**lenth
    temp//=10

if(sum==num):
    print("Arm")
else:
    print("not")