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
# nums=[33,12,67,54,11]

# a=0
# b=len(nums)-1

# while a<b:
#     temp=nums[a]
#     nums[a]=nums[b]
#     nums[b]=temp
#     a+=1
#     b-=1
# print(nums)


#palindrome 
# word="malayalamm"

# def reverse(word):
#     word=list(word)
#     a=0
#     b=len(word)-1
#     original=''.join(word)
    
#     while a<b:
#         temp=word[a]
#         word[a]=word[b]
#         word[b]=temp
#         a+=1
#         b-=1
    
#     if original==''.join(word):
#         return True
#     else:
#         return False

# print(reverse(word))

# sentence="Hey Kaustubh"

# def count_vowels(sentence):
#     vow=['a','e','i','o','u']
    
#     string=list(sentence.lower())
    
#     count=0
#     for i in string:
#         if i in vow:
#             count+=1
#     return count

# print(count_vowels(sentence))        

#student with highest marks
# students = {
#     "Alice": 85,
#     "Bob": 72,
#     "Charlie": 90
# }

# max=0
# for key, value in students.items():
#     if value>max:
#         max=value
#         maxkey=key

# print(f"higest marks are scored by {maxkey} which are {max} ")

words="apple banana apple cherry"

count={}
repeating=[]
string=words.split()

for word in string:
    if word in count:
        count[word]+=1
    else:
        count[word]=1

for i,j in count.items():
    if j>1:
        repeating.append(i)
    
print(repeating)
    

    
    
    
