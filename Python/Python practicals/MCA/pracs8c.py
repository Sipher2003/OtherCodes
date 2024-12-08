#priority queue

import threading
import queue
import time

priority_queue=queue.PriorityQueue()

def process_tasks():
    while not priority_queue.empty():
        priority,task=priority_queue.get()
        print(f"priority is {priority} and task is {task}")
        time.sleep(1)
        priority_queue.task_done()

tasks=[(3,"low pri"),(1,"high pri"),(2,"med pri")]
for task in tasks:
    priority_queue.put(task)


thread1=threading.Thread(target=process_tasks)
thread2=threading.Thread(target=process_tasks)


thread1.start()
thread2.start()

thread1.join()
thread2.join()

print("done")