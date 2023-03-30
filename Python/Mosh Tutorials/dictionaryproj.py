phone=input('Phone: ')

digits={
'1':'one',
'2':'two',
'3':'three',
'4':'four',
'5':'five',
'6':'six',
'7':'seven',
'8':'eight'

}

output=''
for ch in phone:
    output += digits.get(ch,'!')+' '

print(output)
