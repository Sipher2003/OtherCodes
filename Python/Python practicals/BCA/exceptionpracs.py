class Error(Exception):                     #Exception is a predefined class
    pass

class ValueTooSmallError(Error):
    def __init__(self,arg):
        self.strerror=arg

class ValueTooLargeError(Error):
    def __init__(self,arg):
        self.strerror=arg

number=15

while True:
    try:
        input_num=int(input("Guess the number by entering the value: "))
        if input_num<number:
            raise ValueTooSmallError("Value entered is smaller than answer ")
        elif input_num>number:
            raise ValueTooLargeError("Value entered is larger than answer")
        else:
            break
    except ValueTooSmallError as e:
        print("Error message: ",e.strerror,"\n")
    except ValueTooLargeError as e:
        print("Error message: ",e.strerror,"\n")
print("congratulations you guessed the correct answer! \U0001f604")
            





