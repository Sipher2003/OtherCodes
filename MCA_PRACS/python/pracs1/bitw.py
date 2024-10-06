# Function to demonstrate bitwise operations
def bitwise_operations(a, b):
    return a & b, a | b, a ^ b, ~a, ~b

# Input
num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

# Output
results = bitwise_operations(num1, num2)
print(f"AND: {results[0]}, OR: {results[1]}, XOR: {results[2]}, ~a: {results[3]}, ~b: {results[4]}")
