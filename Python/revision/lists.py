thislist = ["apple", "banana", "cherry"]

list=list(("hello","world"))
# print(list)

# list.append("python")
# # list.insert()
# print(list)
# list.extend(thislist)
# print(list)

for x in thislist:
    if 'c' in x:
        list.append(x)
        
print(list)
        