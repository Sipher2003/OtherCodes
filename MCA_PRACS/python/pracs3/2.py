
def countchar(s):
    upper=sum(1 for c in s if c.isupper())
    lower=sum(1 for c in s if c.islower())
    digit=sum(1 for c in s if c.isdigit())
    return upper,lower,digit


s=input("Enter a string: ")
upper,lower,digit=countchar(s)

print(f"upper are {upper},lower are {lower}, and digits are {digit} ")