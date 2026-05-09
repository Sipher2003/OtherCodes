# even or odd
# a=int(input("Enter a number: "))
# if a%2==0:
#     print("Even")
# else:
#     print("Odd")


# #Sum from 1 to n

# def sum(num):
#     addition=0
#     for i in range(1,num+1):
#         addition+=i
#     return addition
    
# print(sum(6))

#max in a list
# nums=[7,9,11,13,42,33]

# def max(my_list):
#     max=0
#     for i in my_list:
#         if i>max:
#             max=i
#     return max

# print(max(nums))
            
    
#sort the list
# nums=[33,12,67,54,11]

# def sort(my_list):    
#     for i in range(len(my_list)):
#         for j in range(len(my_list)-i-1):
#             if(my_list[j]<my_list[j+1]):
#                 temp=my_list[j]
#                 my_list[j]=my_list[j+1]
#                 my_list[j+1]=temp
#     print(my_list)

# sort(nums)    

#reverse a list
nums=[33,12,67,54,11]

a=0
b=len(nums)-1

while a<b:
    temp=nums[a]
    nums[a]=nums[b]
    nums[b]=temp
    a+=1
    b-=1
print(nums)

