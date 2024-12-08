# from pickle import FALSE, TRUE
# from pickletools import string1


from pickletools import string1


print("Program to check if pangram or not")

def chkpangram():
    str="abcdefghiklmnopqrstuvwxyz"
    for x in str:
        if x not in string1:
            return False
    return True
    

string1=input("Enter a sentence: ")

if(chkpangram()):
    print("It is")
else:
    print("It isnt")

chkpangram()
