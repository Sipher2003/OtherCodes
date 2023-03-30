def calculatesal(days,sal):
    print("Your total salary is",days*sal)



def calculatestr(boys,girls):
    print('Total strength of the class is ',boys+girls)

def calculatebill(code):
    if code==1:
        print('Your total bill is $100')
    elif code==2:
        print('Your total bill is $50')
    elif code==3:
        print('Your total bill is $150')
    else:
        print('Invalid')



calculatesal(25,3000)
calculatestr(32,42)
calculatebill(4)