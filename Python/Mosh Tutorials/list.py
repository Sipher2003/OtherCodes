import numbers


# names=['abc','def','ghi','jkl','mno','pqr','stu']

# print(names[0])
# print(names[1])
# print(names[2])
# print(names[-1])  # returns the last value
# print(names[2:])   # returns from 2  
# print(names[2:5])   # returns from 2  to 5


numbers=[1,2,3,4,5,6,7,8]

n=numbers[0]
for X in numbers:
    if X > n:
     n=X

print(n)
    
    