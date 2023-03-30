weight=int(input('Weight: '))
convert=input('Lbs or Kg: ')

if convert=='kg' or 'Kg' or 'kG':
    w=weight/2
    print(f'You are {w} kg')   #Formatted Sring
elif convert=='lbs' or 'Lbs':
    e=weight*2
    print(f'You are {e} lbs')    #Formatted Sring
else:
    print("Invalid input")
