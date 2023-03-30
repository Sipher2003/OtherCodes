str=input("Enter the roll no: ")

if(str.strip().startswith('31') and len(str)==11):
    print("It is a somaiya roll no")
else:
    print("It is not")
