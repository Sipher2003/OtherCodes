def palindrome(str):
    return str==str[::-1]

s=input("enter a word:")
print(s)
pal=palindrome(s)

if(pal):
    print("its a palindrome")
else:
    print("not a palindrome")