def count_until_tuple(elements):
    count=0
    for elem in elements:
        if isinstance(elem,tuple):
            break
        count+=1
    return count

ele=[1,2,3,(4,5),6]
count=count_until_tuple(ele)

print(count)
    