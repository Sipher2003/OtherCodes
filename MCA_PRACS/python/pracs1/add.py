# Function to add three numbers
def add_three_numbers(a, b, c):
    return a + b + c

# Input
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))
num3 = float(input("Enter third number: "))

# Output
result = add_three_numbers(num1, num2, num3)
print(f"The sum of {num1}, {num2}, and {num3} is: {result}")
