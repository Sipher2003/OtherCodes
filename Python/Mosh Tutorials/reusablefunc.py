def emojiconv(message):
    words=message.split(' ')
    # print(words)

    emoji={
    ':)':'😀',
    ':(':'🙁'
    }
    output=''
    for word in words:
        output += emoji.get(word,word)+' '
    return output



message=input('> ')
print(emojiconv(message))
    