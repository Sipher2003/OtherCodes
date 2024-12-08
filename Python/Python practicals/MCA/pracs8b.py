#syncronization
import threading
from threading import *

counter=0

lock=threading.Lock()

def increment_counter():
    global counter
    with lock:
        for _ in range(5):
            counter+=1
            print(f"Count:{counter}")

thread1=threading.Thread(target=increment_counter)
thread2=threading.Thread(target=increment_counter)

thread1.start()
thread2.start()

thread1.join()
thread2.join()

print("Done")

