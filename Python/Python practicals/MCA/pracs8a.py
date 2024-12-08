#threading
import threading
from threading import *
import time

def printnums(name,count):
    for i in range(1,count+1):
        print(f"{name}:{i}")
        time.sleep(1)

thread1=threading.Thread(target=printnums,args=("T1",5))
thread2=threading.Thread(target=printnums,args=("T2",5))

thread1.start()
time.sleep(0.2)
thread2.start()

thread1.join()
thread2.join()

print("done")