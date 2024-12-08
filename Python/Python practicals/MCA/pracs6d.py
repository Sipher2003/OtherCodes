#deque add,remove,view ,size from both sides 

from collections import deque

class Deque:
    def __init__(self):
        self.deque=deque()

    def is_empty(self):
        return len(self.deque)==0


    def addleft(self,item):
        self.deque.appendleft(item)
    
    def addrear(self,item):
        self.deque.append(item)
    
    def remleft(self):
        if not self.is_empty():
            return self.deque.popleft()
        return "deque is empty"
    
    def remright(self):
        if not self.is_empty():
            return self.deque.pop()
        return "deque is empty"

deq=Deque()   
deq.addleft(20)
deq.addleft(10)
deq.addrear(30)
print(deq.deque)
deq.remleft()
print(deq.deque)