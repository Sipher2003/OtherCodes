from cryptography.fernet import Fernet

# Generate a key (do this once and store it safely)
key = Fernet.generate_key()
cipher_suite = Fernet(key)

# Encrypt password
password = "password123"
encrypted_password = cipher_suite.encrypt(password.encode())

# Decrypt password
decrypted_password = cipher_suite.decrypt(encrypted_password).decode()

print("Key:", key)
print("Encrypted:", encrypted_password)
print("Decrypted:", decrypted_password)
