f=open("Demofile.txt",'w')
f.write("My name is Shawn\nI am 19 years old\nI love bikes\nmy favourite bike is Aprilla 1000cc")
f=open("Demofile.txt",'r')
content=f.readlines()
print("Enter the number of lines to be read from the end: ")
n=int(input())
if n<=0:
    print("Invalid number of lines specified!")
    print("Do you want to try again?Y/N: ")
    ans=input()
    if ans=='y'or ans=="Y":
        print("Enter the number of lines to be read from the end")
        n = int(input())
        for x in content[-n:]:
            print(x,end="")
        else:
            pass
else:
    for x in content[-n:]:
        print(x,end="")
