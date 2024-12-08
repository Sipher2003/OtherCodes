# To Implement a program with same method name and multiple arguments


class Display:
    def show(self,*args):
        if len(args)==1:
            print(f"Only 1 argument {args[0]}")
        elif len(args)==2:
            print(f"two arguments {args[0]} and {args[1]}")
        else:
            print(f"multiple args {args}")

d1=Display()
d1.show("hello")
d1.show("hello","wrold")
d1.show("hello","wrold",21)