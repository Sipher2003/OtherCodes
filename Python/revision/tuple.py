thislist = ["apple", "banana", "cherry"]
thistuple=tuple(thislist)
temptuple=list(thistuple)
temptuple.append("mango")
thistuple=tuple(temptuple)

print(thistuple)