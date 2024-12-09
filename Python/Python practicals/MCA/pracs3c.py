# count the occurences of each word

def count_word_occurences(sentence):
    words=sentence.split()
    occurences={}

    for word in words:
        occurences[word]=occurences.get(word,0)+1
    return occurences

sent=input("Enter a sentence")
rep=count_word_occurences(sent)
print(rep)




#     words=sentence.split()
#     occurences={}

#     for word in words:
#         occurences[word]=occurences.get(word,0)+1
#     return occurences

# sent=input("Enter a sentence: ")
# repeat=count_word_occurences(sent)
# print(repeat) 



