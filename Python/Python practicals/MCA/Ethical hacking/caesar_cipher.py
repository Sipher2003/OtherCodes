def encrypt(text, shift):
    result = ""
    for char in text:
        if char.isalpha():  # Encrypt only alphabetic characters
            base = ord('A') if char.isupper() else ord('a')
            result += chr((ord(char) - base + shift) % 26 + base)
        else:
            result += char
    return result


def decrypt(cipher, shift):
    return encrypt(cipher, -shift)  # Reverse shift for decryption


# Example usage
plain_text = "HELLO WORLD"
shift = 3

encrypted = encrypt(plain_text, shift)
decrypted = decrypt(encrypted, shift)

print("Plain Text : ", plain_text)
print("Encrypted  : ", encrypted)
print("Decrypted  : ", decrypted)
