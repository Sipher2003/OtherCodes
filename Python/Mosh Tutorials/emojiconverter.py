message=input('> ')
words=message.split(' ')
# print(words)

emoji={
    ':)':'😀',
    ':(':'🙁'
}
output=''
for word in words:
    output += emoji.get(word,word)+' '

print(output) 
