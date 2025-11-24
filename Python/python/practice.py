# print("hello world")

# x=5
# y=6
# print(x+y)

# x="hello"

# x=3+5j  #complex

# x=int(2)
# y=int(2.5)
# z=int("2")

# print(x)
# print(y)
# print(z)

# x="hello world"

# print(x)
# print(x[1])


# for x in x:
#     print(x)
# print(x[2:5])

# print(x)

# for i in range(1,6):
#     print(i)

# nums=[1,0,1,0,1,0]

# num=0

# for i in nums:
#     num=(num*10)+i
num=int(input("Enter a number to check "))

# num=191
temp=0
og=num

while num>0:
     t=num%10
     temp=(temp*10)+t
     num=num//10

if (temp==og):
     print("palindrome")



