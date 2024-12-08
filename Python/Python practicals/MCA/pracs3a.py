#bubble sort using python

def sort(nums):
    for i in range(len(nums)-1,0,-1):
        for j in range(i):
            if nums[j]>nums[j+1]:
                temp=nums[j]
                nums[j]=nums[j+1]
                nums[j+1]=temp

list1=[5,3,8]
list2=[6,7,2]
merged=list1+list2
# print(merged)

sort(merged)
print(merged)
print(f"Second largest = {merged[-2]}")
