# Function to add two binary numbers
def add_binary(bin1, bin2):
    return bin(int(bin1, 2) + int(bin2, 2))[2:]

# Input
binary1 = input("Enter first binary number: ")
binary2 = input("Enter second binary number: ")

# Output
result = add_binary(binary1, binary2)
print(f"The sum of {binary1} and {binary2} is: {result}")
