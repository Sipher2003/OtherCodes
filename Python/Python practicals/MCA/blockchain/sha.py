#Implementation of SHA 256 Algorithm
import struct
import hashlib
def sha256(data):
    """Compute the SHA-256 hash of the input data."""
    # Initialize hash values
    h = [
        0x6a09e667,
        0xbb67ae85,
        0x3c6ef372,
        0xa54ff53a,
        0x510e527f,
        0x9b05688c,
        0x1f83d9ab,
        0x5be0cd19,
    ]

    # Initialize array of round constants
    k = [
        0x428a2f98, 0x71374491, 0xb5c0fbcf, 0xe9b5dba5,
        0x3956c25b, 0x59f111f1, 0x923f82a4, 0xab1c5ed5,
        0xd807aa98, 0x12835b01, 0x243185be, 0x550c7dc3,
        0x72be5d74, 0x80deb1fe, 0x9bdc06a7, 0xc19bf174,
        0xe49b69c1, 0xefbe4786, 0x0fc19dc6, 0x240ca1cc,
        0x2de92c6f, 0x4a7484aa, 0x5cb0a9dc, 0x76f988da,
        0x983e5152, 0xa831c66d, 0xb00327c8, 0xbf597fc7,
        0xc6e00bf3, 0xd5a79147, 0x06ca6351, 0x14292967,
        0x27b70a85, 0x2e1b2138, 0x4d2c6dfc, 0x53380d13,
        0x650a7354, 0x766a0abb, 0x81c2c92e, 0x92722c85,
        0xa2bfe8a1, 0xa81a664b, 0xc24b8b70, 0xc76c51a3,
        0xd192e819, 0xd6990624, 0xf40e3585, 0x106aa070,
        0x19a4c116, 0x1e376c48, 0x2748774c, 0x34b0bcb5,
        0x391c0cb3, 0x4ed8aa11, 0x5b9cca4f, 0x682e6ff3,
        0x748f82ee, 0x78a5636f, 0x84c87814, 0x8cc70208,
        0x90befffa, 0xa4506ceb, 0xbef9a3f7, 0xc67178f2,
    ]
    # Pre-processing
    original_byte_len = len(data)
    original_bit_len = original_byte_len * 8
    data += b'\x80'
    data += b'\x00' * ((56 - (original_byte_len + 1) % 64) % 64)
    data += struct.pack('>Q', original_bit_len)
    # Process the message in successive 512-bit chunks
    for i in range(0, len(data), 64):
        chunk = data[i:i + 64]
        w = list(struct.unpack('>16L', chunk)) + [0] * 48
        for j in range(16, 64):
            s0 = (right_rotate(w[j - 15], 7) ^
                  right_rotate(w[j - 15], 18) ^
                  (w[j - 15] >> 3))
            s1 = (right_rotate(w[j - 2], 17) ^
                  right_rotate(w[j - 2], 19) ^
                  (w[j - 2] >> 10))
            w[j] = (w[j - 16] + s0 + w[j - 7] + s1) & 0xFFFFFFFF

        a, b, c, d, e, f, g, h_ = h

        for j in range(64):
            S1 = (right_rotate(e, 6) ^
                  right_rotate(e, 11) ^
                  right_rotate(e, 25))
            ch = (e & f) ^ (~e & g)
            temp1 = (h_ + S1 + ch + k[j] + w[j]) & 0xFFFFFFFF
            S0 = (right_rotate(a, 2) ^
                  right_rotate(a, 13) ^
                  right_rotate(a, 22))
            maj = (a & b) ^ (a & c) ^ (b & c)
            temp2 = (S0 + maj) & 0xFFFFFFFF

            h_ = g
            g = f
            f = e
            e = (d + temp1) & 0xFFFFFFFF
            d = c
            c = b
            b = a
            a = (temp1 + temp2) & 0xFFFFFFFF

        h = [
            (h[0] + a) & 0xFFFFFFFF,
            (h[1] + b) & 0xFFFFFFFF,
            (h[2] + c) & 0xFFFFFFFF,
            (h[3] + d) & 0xFFFFFFFF,
            (h[4] + e) & 0xFFFFFFFF,
            (h[5] + f) & 0xFFFFFFFF,
            (h[6] + g) & 0xFFFFFFFF,
            (h[7] + h_) & 0xFFFFFFFF,
        ]
    return b''.join(struct.pack('>L', part) for part in h)
def right_rotate(value, amount):
    """Right rotate a 32-bit integer value by amount bits."""
    value &= 0xFFFFFFFF
    return ((value >> amount) | ((value << (32 - amount)) & 0xFFFFFFFF)) & 0xFFFFFFFF


if __name__ == "__main__":
    # quick self-test against hashlib for a few sample inputs
    tests = [b"", b"abc", b"hello world", b"The quick brown fox jumps over the lazy dog"]
    for t in tests:
        my = sha256(t).hex()
        lib = hashlib.sha256(t).hexdigest()
        print(t or b"<empty>", "->", my)
        if my != lib:
            print("Mismatch! expected", lib)
        else:
            print("OK")
