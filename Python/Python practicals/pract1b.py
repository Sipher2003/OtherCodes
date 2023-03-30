print("Python program to check whether the number is Even or Odd")

def evenodd():
    num=int(input("Enter the number: "))

    if(num%2==0):
        print(f"The number {num} is even")
    else:
        print(f"The number {num} is odd")


evenodd()