ch=input("Enter a character: ")
print(ch)

vowels=["a","e","i","o","u","A","E","I","O","U"]


if ch in vowels:
    print(f"{ch} is a vowel")
else:
    print(f"{ch} is a consonant")
