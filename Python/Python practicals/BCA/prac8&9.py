class Animal:
    def __init__(self, species, location):
        self.species = species
        self.location = location
    def printDetails(self):
        print("Hello! I am a Animal")
        print("species:", self.species)
        print("location:", self.location)

class Wild(Animal):
    def __init__(self, species, location, type, animal):
        Animal.__init__(self, species, location)
        self.type = type
        self.animal = animal
    def printDetails(self):
        print("- - - - - - - - - - - - - -")
        print("Hello! I am a Wild Animal")
        print("species:", self.species)
        print("location:", self.location)
        print("type:", self.type)
        print("animal:", self.animal)

class Domestic(Animal):
    def __init__(self, species, location, type, animal):
        Animal.__init__(self, species, location)
        self.type = type
        self.animal = animal
    def printDetails(self):
        print("- - - - - - - - - - - - - -")
        print("Hello! I am a Domestic Animal")
        print("species:", self.species)
        print("location:", self.location)
        print("type:",self.type)
        print("animal:",self.animal)

class cat(Wild):
    def __init__(self, species, location, type, animal):
        Wild.__init__(self, species, location, type, animal)
         
    def printDetails(self):
        print("- - - - - - - - - - - - - -")
        print("Hello i am a Domesticated Wild Cat")
        print("species:",self.species)
        print("location:",self.location)
        print("type:",self.type)
        print("animal:",self.animal)
       

p1=Animal("Mammal","world")
p1.printDetails()

s1=Wild("Mammal","Africa","wild","Lion")
s1.printDetails()

b1=Domestic("Mammal","House","domestic","dog")
b1.printDetails()

m1 =cat("Mammal", "House", "domestic", "Cat")
m1.printDetails()
