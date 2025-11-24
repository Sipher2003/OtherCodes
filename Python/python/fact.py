def factorial(num):
    if num<0:
        return 0
    elif(num==0 or num==1):
        return 0
    else:
        factorial=1
        for i in range(1,num+1):
            factorial*=i
        return factorial
    
print(factorial(5))
    