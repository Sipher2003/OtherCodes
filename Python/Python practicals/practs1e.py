
print("Program to check for palindrome")
no=int(input("Enter the number from the user: "))

def palindrome(no):
    temp=no
    sum=0
    while(no>0):
      rem=no%10
      sum=sum*10+rem
      no = int(no/10)

    if(sum==temp):
      print("It is a palindrome")
    else:
      print("It isn't a palindrome")


palindrome(no)

def armstrong(no):
    sum=0
    temp=no
    while temp>0:
        digit=temp%10
        sum+=digit**3
        temp //=10

    if(no==sum):
        print("It is an armstrong")
    else:
        print("It isnt an armstrong")

armstrong(no)


