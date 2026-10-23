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
# num=int(input("Enter a number to check "))

# # num=191
# temp=0
# og=num

# while num>0:
#      t=num%10
#      temp=(temp*10)+t
#      num=num//10

# if (temp==og):
#      print("palindrome")



# name="Kaustubh Bhosale"


# print(name.replace("Bhosale","Kaustubh"))


# for i in range(1,11,2):
#      print(i)



# def greeting(statement):
#      match statement:
#           case "Hello World":
#                return "Positive"
#           case "Get Lost":
#                return "Negative"
#           case "Thanks":
#                return "Positive"
#           case _:
#                return "Not found"


# print(greeting("Thanks"))



# name="Kaustubh"
# lst=list(name)
# print(lst)

# for i,v in  enumerate((lst),start=1):
#      print(f"{i}:{v}")
     

# def chk_prime(num):
#     ans=[]
    
#     for i in range(2,num+1):
#          isprime=True
#          for j in range(2,int(i**0.5)+1):
#               if i%j==0:
#                    isprime=False
#                    break
#          if isprime:
#             ans.append(i)
#     return ans

# print(chk_prime(10))


# def fibo(n):
#      a,b=0,1
#      while a<=n:
#           print(a, end=" ")
#           a,b=b,a+b


# fibo(20)  0 1 1 2 3 5 8 13 


# def fibo(n):
#      a,b=0,1
     
#      count = 1
     
#      while count<=n:
#           print(a,end=" ")
#           a,b=b,a+b
#           count+=1
     
# fibo(10) 0 1 1 2 3 5 8 13 21 34 

# lst=[1,2,3,4,5,6,7,8,9]
# ans=lst.copy()

# for i in lst:
#      lst.pop()

# print(lst)
# print(ans)


# class Myclass:
#      name="Kaus"
     
# p1=Myclass()
# print(p1.name)

# class myclass:
#      def __init__(self,name):
#           self.name=name
     
#      def greet(abc):
#           print(f"Name is {abc.name}")
          
# p1=myclass("Kaustubh")
# p1.greet()


sentence="python is fun"
stack=[]
temp=""


for char in sentence:
     if char==" ":
          if temp:
               stack.append(temp)
               temp=""
     else:
          temp+=char
     
if temp:
     stack.append(temp)

ans=""
while len(stack)>0:
     word=stack.pop()
     if ans=="":
          ans=word
     else:
          ans+=" "+ word

print(ans)     

