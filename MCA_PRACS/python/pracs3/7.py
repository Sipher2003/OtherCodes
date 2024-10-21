def set_operations():
    my_set = {1, 2, 3, 4}
    my_set.add(5)
    print("Set after adding 5:", my_set)
    
    my_set.remove(2)
    print("Set after removing 2:", my_set)
    
    another_set = {3, 4, 5, 6}
    print("Union:", my_set | another_set)
    print("Intersection:", my_set & another_set)
    print("Difference:", my_set - another_set)
    print("Symmetric Difference:", my_set ^ another_set)

set_operations()
