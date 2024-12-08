def add_bin(bin1,bin2):
    return bin(int(bin1,2)+int(bin2,2))[2:]

bina1=input("Enter binnumber 1:")
bina2=input("Enter binnumber 2:")

res=add_bin(bina1,bina2)

print(f"Addition is {res}")