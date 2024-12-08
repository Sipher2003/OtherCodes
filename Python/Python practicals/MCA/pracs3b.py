#count char

def countchar(s):
    upper=sum(1 for c in s if c.isupper())
    lower=sum(1 for c in s if c.islower())
    digit=sum(1 for c in s if c.isdigit())

    return upper,lower,digit

inp=input("Enter a word: ")
upper,lower,digit=countchar(inp)

print(f"Upper are {upper},lower are {lower} and digit are {digit}")