#multiple inheritence 

class Mother:
    mothername=""
    def mother(self):
        print(self.mothername)


class Father:
    fathername=""
    def father(self):
        print(self.fathername)

class Child(Mother,Father):
    def parents(self):
        print("Father:",self.fathername)
        print("Mother",self.mothername)

c1=Child()
c1.mothername="MA"
c1.fathername="PA"
c1.parents()