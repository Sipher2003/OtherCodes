
print('This is a program to calculate cumulative sum of numbers')
print('Keep entering numbers and print X to show the result')

def show_sum():
    sum=0
    character='y'

    while(character!='x' and character!='X'):
        character=input("Enter the input: ")
        if(character=='X' or character=='x'):
            print(sum)
        else:
            character=int(character)
            sum=sum+character



show_sum()