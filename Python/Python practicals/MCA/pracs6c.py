#queue add,remove,size,view
#uses FIFO
class Queue:
    def __init__(self):
        self.queue=[]

    def add_elem(self,item):
        self.queue.append(item)

    def is_empty(self):
        return len(self.queue)==0

    def rem_elem(self):
        if not self.is_empty():
            return self.queue.pop(0)    
        return "Empty"
    
    def view(self):
        if not self.is_empty():
            return self.queue[0]    
        return "Empty"
    
    def size(self):
        return len(self.queue)
    
queue=Queue()
queue.add_elem(10)
queue.add_elem(20)
queue.add_elem(30)

print(f"View 1st element {queue.view()}")
print(f"Remove element {queue.rem_elem()}")
print(f"Size after removing {queue.size()}")