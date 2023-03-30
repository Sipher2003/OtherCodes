
str=input("Enter the character:  ")
def chkvowel():
    
    if(str=="a" or str=="A" or str=="e" or str=="E" or str=="i" or str=="I" or str=="o" or str=="O" or str=="u" or str=="U"):
        return True
    else:
        return False

while(not (str.isalpha())):
    str=input("Enter the character:  ")


if(chkvowel()):
    print("It is")
else:
    print("It isnt")


