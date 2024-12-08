#implement stack: add,remove,view,size

class Stack:
    def __init__(self):
        self.stack=[]    #empty stack

    def add_elem(self,item):
        self.stack.append(item)
    
    def is_empty(self):
        return len(self.stack)==0

    def rem_elem(self):
        if not self.is_empty():
           return self.stack.pop()
        return "Stack is empty"
    
    def view(self):
        if not self.is_empty():
            return self.stack[-1]
        return "Stack is empty"
    
    def size(self):
        return len(self.stack)


stack=Stack()
stack.add_elem(10)
stack.add_elem(20)
stack.add_elem(30)

print(f"top element is {stack.view()}")
print(f"Size is {stack.size()}")
stack.rem_elem()
print(f"top element is {stack.view()}")
print(f"After Romoving {stack.size()}")

