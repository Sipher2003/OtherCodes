try:
    print("Enter file name which you want to create: ")
    fname = input()
    f = open(fname, 'w')
    content = input("Enter the content of the file: ")
    f.write("\n" + content)
    f.close()
    print("Do you wish to append: ")
    ans = input()
    while ans == 'yes':
        content = input("Enter the content of the file: ")
        f = open(fname, "a")
        f.write("\n" + content)
        f.close()

        txt = open(fname, "r")
        print(txt.read())

        print("Do you wish to append: ")
        ans = input()
        
    print("File has been added!")

except:
    print(fname + "is an Invalid File!")
finally:
    print("Done!")
