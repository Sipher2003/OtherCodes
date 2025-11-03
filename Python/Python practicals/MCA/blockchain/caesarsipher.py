#caesar sipher python code
def caesar_cipher(text, shift):
    result = ""

    # traverse text
    for i in range(len(text)):
        char = text[i]

        # Encrypt uppercase characters
        if char.isupper():
            result += chr((ord(char) + shift - 65) % 26 + 65)

        # Encrypt lowercase characters
        elif char.islower():
            result += chr((ord(char) + shift - 97) % 26 + 97)

        else:
            result += char

    return result

# Example usage
text = "Hello, World!"
shift = 3
encrypted_text = caesar_cipher(text, shift)
print("Original Text: " + text)
print("Shift: " + str(shift))
print("Encrypted Text: " + encrypted_text)
decrypted_text = caesar_cipher(encrypted_text, -shift)
print("Decrypted Text: " + decrypted_text)
