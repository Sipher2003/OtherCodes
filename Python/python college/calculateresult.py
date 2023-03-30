
def cal_result(maths,eng,sci):
    percentage=(maths+eng+sci)/3

    if(maths<35 or eng<35 or sci<35):
        print("you are failed")
    elif(percentage>=80):
        print(f'You have got A+ Grade with {percentage} percentage')
    elif(percentage>=70 or percentage<80):
        print(f'You have got A Grade with {percentage} percentage')
    elif(percentage>=60 or percentage<70):
        print(f'You have got B+ Grade with {percentage} percentage')
    elif(percentage>=50 or percentage<60):
        print(f'You have got B Grade with {percentage} percentage')
    elif(percentage>=40 or percentage<50):
        print(f'You have got C+ Grade with {percentage} percentage')
    else:
        print('REEXAM')


cal_result(50,72,88)
#blabla blabla