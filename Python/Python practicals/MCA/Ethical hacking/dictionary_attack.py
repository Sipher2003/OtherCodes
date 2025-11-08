import hashlib

def hash_password(password):
    """Generate SHA-256 hash of a password"""
    return hashlib.sha256(password.encode()).hexdigest()

def dictionary_attack(hash_to_crack, dictionary):
    """Try all passwords from dictionary list"""
    for password in dictionary:
        hashed = hash_password(password)
        if hashed == hash_to_crack:
            return password
    return None

# Step 1: Create hash for target password
original_password = "abcdef"
hashed_password = hash_password(original_password)

# Step 2: Simulate dictionary of guesses
dictionary = ["admin", "password", "123456", "abcdef", "root"]

# Step 3: Try to crack hash
found_password = dictionary_attack(hashed_password, dictionary)

if found_password:
    print(f"Password found: {found_password}")
else:
    print("Password not found.")
