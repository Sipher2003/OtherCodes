# List Items
# List items are ordered, changeable, and allow duplicate values.

# List items are indexed, the first item has index [0], the second item has index [1] etc.

# Ordered
# When we say that lists are ordered, it means that the items have a defined order, and that order will not change.

# If you add new items to a list, the new items will be placed at the end of the list.

# Note: There are some list methods that will change the order, but in general: the order of the items will not change.

# Changeable
# The list is changeable, meaning that we can change, add, and remove items in a list after it has been created.

# Allow Duplicates
# Since lists are indexed, lists can have items with the same value:

list=["apple","banana","cherry"]
# print(len(list))
# print(list[0:3])

# for x in list:
#     if x=="banana":
#         print("banana is present")

# change list item
# list[2]="mango"
# print(list)

# list.insert(3,"cherry")
# print(list)


# #remove item
# list.remove("cherry")
# print(list)

#list comprehension
newlst=[]
for x in range(len(list)):
    if(list[x]=="banana"):
        print(x)
# print(newlst)