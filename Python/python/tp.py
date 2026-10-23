print("hello")




def check_prime(num):
    if num==0 or num==1:
        return False
    
    if num==2:
        return True
    
    if (num%1==0 and num%num==0) and num%2!=0:
        return True
    
    return False

def get_prime(num):
    ans=[]
    for i in range(num+1):
        if (i%1==0 and i%i==0) and i%2!=0:
            ans.append(i)
    
    return ans
        


print(check_prime(14))
print(get_prime(0))

