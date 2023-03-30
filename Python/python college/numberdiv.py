num=int(input('Enter a number: '))
print('The divisors of this number from 1 to 10 are: ')
for x in range(1,11):
    if(num%x==0):
        print(x)


