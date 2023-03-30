p1=input('Enter rock/paper/scissor: ')
p2=input('Enter rock/paper/scissor: ')

if((p1=='rock' and p2=='scissor') or (p1=='paper' and p2== 'rock') or (p1=='scissor' and p2=='paper')):
    print('player 1  wins!!')
elif(p1==p2):
    print('Its a draw')
else:
    print('Player 2 wins!')


