num=int(input("enter a number: "))


order=len(str(num))

sum=0

temp=num

while temp>0:
    digit=temp%10
    sum=sum+digit**order
    temp//=10

if(num==sum):
    print(f"{num} is an armstrong number")
else:
    print(f"{num} is not an armstrong number")
