class Node:
    def __init__(self, data):
        self.data = data  # Data in the node
        self.next = None  # Next node reference

class LinkedList:
    def __init__(self):
        self.head = None  # Initially, the list is empty

    # Insert a new node with given data
    def insert(self, data):
        new_node = Node(data)
        if self.head is None:  # If list is empty, the new node becomes the head
            self.head = new_node
        else:
            current = self.head
            while current.next:  # Traverse to the end of the list
                current = current.next
            current.next = new_node  # Add the new node at the end

    # Traverse and print the linked list
    def traverse(self):
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")  # End of the list

    # Remove a node by its value
    def remove(self, data):
        current = self.head
        if current and current.data == data:  # If the node to be removed is the head
            self.head = current.next  # Move the head pointer to the next node
            return
        prev = None
        while current and current.data != data:
            prev = current
            current = current.next
        if current is None:  # If data is not found
            print("Data not found")
            return
        prev.next = current.next  # Bypass the current node to remove it

# Create the linked list and test
ll = LinkedList()
ll.insert(10)
ll.insert(20)
ll.insert(30)

print("List after insertion:")
ll.traverse()  # Output: 10 -> 20 -> 30 -> None

ll.remove(20)
print("List after removing 20:")
ll.traverse()  # Output: 10 -> 30 -> None
