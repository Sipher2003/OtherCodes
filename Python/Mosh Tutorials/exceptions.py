try:
    age=int(input('Age> '))
    income=20000
    risk=income/age
    print(age)
except ZeroDivisionError:
    print('Error! You are dividing by zero')
except ValueError:
    print('Invalid  statement')

