def  bitwisecal(a,b):
    return a&b,a|b,a^b,~a,~b

num1=int(input("Enter number 1:"))
num2=int(input("Enter number 2:"))

res=bitwisecal(num1,num2)

print(f"and{res[0]},or{res[1]},xor{res[2]},~a{res[3]},~b{res[4]}")
