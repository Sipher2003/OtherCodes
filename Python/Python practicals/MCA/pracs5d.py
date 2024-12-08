#operator overloading

class complex:
    def __init__(self,a,b):
        self.a=a
        self.b=b

    def __add__(self,other):
        return self.a+other.a,self.b+other.b
    

ob1=complex(2,4)
ob2=complex(3,4)
ob3=ob1+ob2
print(ob3)        