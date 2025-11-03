# Implement RSA and show the encryption as well as decryption
# process

import random
from sympy import isprime, mod_inverse
from math import gcd
import sympy
import sys
import logging

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)
class RSA:
    def __init__(self, bit_length=1024):
        self.bit_length = bit_length
        self.p = self.generate_large_prime()
        self.q = self.generate_large_prime()
        self.n = self.p * self.q
        self.phi = (self.p - 1) * (self.q - 1)
        self.e = self.choose_e()
        self.d = mod_inverse(self.e, self.phi)
        logger.info(f"Generated RSA keys with n={self.n}, e={self.e}, d={self.d}")

    def generate_large_prime(self):
        while True:
            prime_candidate = sympy.randprime(2**(self.bit_length-1), 2**self.bit_length)
            if isprime(prime_candidate):
                return prime_candidate

    def choose_e(self):
        e = 65537  # Common choice for e
        if gcd(e, self.phi) == 1:
            return e
        else:
            raise ValueError("e is not coprime with phi")

    def encrypt(self, plaintext):
        plaintext_int = int.from_bytes(plaintext.encode('utf-8'), 'big')
        ciphertext = pow(plaintext_int, self.e, self.n)
        logger.info(f"Encrypted '{plaintext}' to ciphertext {ciphertext}")
        return ciphertext

    def decrypt(self, ciphertext):
        decrypted_int = pow(ciphertext, self.d, self.n)
        byte_length = (decrypted_int.bit_length() + 7) // 8
        decrypted_message = decrypted_int.to_bytes(byte_length, 'big').decode('utf-8')
        logger.info(f"Decrypted ciphertext {ciphertext} to '{decrypted_message}'")
        return decrypted_message
# Example usage
if __name__ == "__main__":
    rsa = RSA(bit_length=16)  # Using smaller bit length for demonstration
    message = "HELLO"
    ciphertext = rsa.encrypt(message)
    decrypted_message = rsa.decrypt(ciphertext)
    print(f"Original Message: {message}")
    print(f"Ciphertext: {ciphertext}")
    print(f"Decrypted Message: {decrypted_message}")
    
