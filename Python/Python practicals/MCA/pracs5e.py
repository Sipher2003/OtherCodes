def divide(a,b):
    try:
        res=a/b
        print(res)
    except ZeroDivisionError:
        print("divide by 0 not allowed")
    except TypeError:
        print("Wrong type")
    finally:
        print("program done")


divide(3,4)
divide(3,0)
divide("a",7)
