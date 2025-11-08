import string

# XOR-based simple cipher (RC4-like concept)
def xor_cipher(data, key):
    """Encrypt/Decrypt data using XOR with repeating key."""
    result = []
    data_bytes = data.encode('utf-8')
    key_bytes = key.encode('utf-8')
    key_len = len(key_bytes)

    for i in range(len(data_bytes)):
        xored_byte = data_bytes[i] ^ key_bytes[i % key_len]
        result.append(chr(xored_byte))

    return "".join(result)


# Step 1: Encrypt using a secret key
PLAINTEXT = "MCA Ethical Hacking"
SECRET_KEY = "x"   # small key for demo

CIPHERTEXT = xor_cipher(PLAINTEXT, SECRET_KEY)

print("Original Plaintext:", PLAINTEXT)
print("Secret Key Used:   ", SECRET_KEY)
print("Generated Ciphertext (encoded):", CIPHERTEXT.encode('utf-8'))
print("-" * 60)


# Step 2: Attempt Brute-Force Attack
print("Starting Brute-Force Attack...")

POSSIBLE_KEYS = string.ascii_lowercase  # Try all lowercase letters
FOUND = False

for attempt_key in POSSIBLE_KEYS:
    decrypted_text = xor_cipher(CIPHERTEXT, attempt_key)
    if decrypted_text == PLAINTEXT:  # Check if plaintext matches
        print("\nDecryption Successful!")
        print(f"Key Found: '{attempt_key}'")
        print(f"Plaintext: {decrypted_text}")
        FOUND = True
        break

if not FOUND:
    print("Brute-force failed to find the correct key.")
