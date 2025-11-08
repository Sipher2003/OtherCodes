from PIL import Image

def encode_image(image_path, secret_message, output_path):
    img = Image.open(image_path)
    binary_message = ''.join(format(ord(c), '08b') for c in secret_message)
    img_data = list(img.getdata())
    new_data = []
    data_index = 0

    for pixel in img_data:
        r, g, b = pixel
        if data_index < len(binary_message):
            r = (r & ~1) | int(binary_message[data_index])
            data_index += 1
        if data_index < len(binary_message):
            g = (g & ~1) | int(binary_message[data_index])
            data_index += 1
        if data_index < len(binary_message):
            b = (b & ~1) | int(binary_message[data_index])
            data_index += 1
        new_data.append((r, g, b))

    img.putdata(new_data)
    img.save(output_path)

def decode_image(image_path):
    img = Image.open(image_path)
    binary_message = ''
    for pixel in img.getdata():
        for color in pixel:
            binary_message += str(color & 1)
    message = ''
    for i in range(0, len(binary_message), 8):
        byte = binary_message[i:i+8]
        if len(byte) == 8:
            message += chr(int(byte, 2))
    return message.strip('\x00')

# Example usage
encode_image("input.png", "SecretMessage", "encoded.png")
print("Decoded:", decode_image("encoded.png"))
