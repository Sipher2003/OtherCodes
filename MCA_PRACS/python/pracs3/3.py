def count_word_occurrences(sentence):
    words = sentence.split()
    occurrences = {}
    for word in words:
        occurrences[word] = occurrences.get(word, 0) + 1
    return occurrences

# Example usage
sentence = "hello world hello"
word_counts = count_word_occurrences(sentence)
print("Word Occurrences:", word_counts)
