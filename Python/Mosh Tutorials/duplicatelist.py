lis=[2,2,3,5,6,7,4,6]
unix=[]

for number in lis:
    if number not in unix:
        unix.append(number)

print(unix)
