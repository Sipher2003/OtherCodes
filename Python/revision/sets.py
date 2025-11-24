thislist = ["apple", "banana", "cherry"]

thisset=set(thislist)
set2={"pineapple","kiwi","apple"}
print(thisset)

print(thisset.union(set2))
thisset.update(set2)
print(thisset)
# print(thisset.intersection(set2))