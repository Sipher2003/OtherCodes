def concatenate_dict(dict1,dict2):
    concatenate={**dict1,**dict2}
    totsum=sum(concatenate.values())
    return concatenate,totsum

dict1={"a":12,"b":13}
dict2={"c":14,"d":15}
concat,sum=concatenate_dict(dict1,dict2)

print(f"sum is {sum}")