import cmath


def solve_quad(a,b,c):
    d=(b**2)-(4*a*c)
    sol1=(-b+cmath.sqrt(d))/(2*a)
    sol2=(-b-cmath.sqrt(d))/(2*a)
    return sol1 , sol2

num1=float(input("Enter first number:"))
num2=float(input("Enter second number:"))
num3=float(input("Enter third number:"))

result=solve_quad(num1,num2,num3)

print(f"The result is {result[0]},{result[1]}")


