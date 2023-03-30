name="My name is kaustubh"
print(len(name))  #Length of the string
print(name.upper()) #Converts to upper case 
print(name.lower()) #Converts to lower case 
print(name.find('M')) #Returns the index value of M
print(name.find('a')) #Returns 4 
print(name.find('A'))  #find is case sensitive and will return -1 as we dont have uppercase A
print(name.find('kaustubh')) #returns 11 as the word starts from 11th position
print(name.replace('kaustubh','sipher')) #will replace kaustubh with sipher.Remember this is also case sensitive .
print(name.replace('a','o')) # will replace all the 'a' present in the string with 'o'
print('My' in name) #Checks if My is present in the string or not and return boolean value,