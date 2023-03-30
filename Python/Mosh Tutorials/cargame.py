inp1=input('> ')

# while i!=1: 
if(inp1=='help'):
    print("Start-To start the car")
    print("Stop-To stop the car")
    print("Exit-To exit the car")
else:
    print('I dont understand that')
#  i-=1
 

inp2=input('Enter: ')

if(inp2=='Start'):
    print('The car has started')
    inp3=input('Enter: ')
if(inp2=='Stop' or inp3=='Stop'):
    print('The car has stopped')
    inp3=input('Enter: ')
if(inp2=='Exit' or inp3=='Exit'):
    print("Exited the car")



