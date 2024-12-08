def check_character():
    chara=input("Enter a character: ")
    if len(chara)>1 or not chara.isalpha():
        return "Enter a valid character"

    chara=chara.lower()
    vow=["a","e","i","o","u"]

    if chara in vow:
        return"vowel"
    else:
        return"consonant"

result=check_character()
print(result)