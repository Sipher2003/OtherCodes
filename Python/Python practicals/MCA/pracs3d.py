# add search delete ina dictionary

def handle_dictionary():
    dict={}
    while True:
        oper=input("Enter the operation: ").strip().lower()
     
        if oper=="add":
            key=input("Enter key")
            value=input("Enter value")
            dict[key]=value
        elif oper=="search":
            key=input("Enter key to serach: ")
            print("Value:",dict.get(key,"key not found"))
        elif oper=="delete":
            key=input("Enter key to delete: ")
            dict.pop(key,None)
        elif oper=="exit":
            break
        else:
            print("invalid")

handle_dictionary()



# def handle_dictionary():
#     my_dict = {}
#     while True:
#         oper = input("\nEnter an operation (add, search, delete, exit): ").strip().lower()
     
#         if oper == "add":
#             key = input("Enter key: ").strip()
#             value = input("Enter value: ").strip()
#             my_dict[key] = value
#             print(f"Added: {key} -> {value}")
        
#         elif oper == "search":
#             key = input("Enter key to search: ").strip()
#             print("Value:", my_dict.get(key, "Key not found."))
        
#         elif oper == "delete":
#             key = input("Enter key to delete: ").strip()
#             if key in my_dict:
#                 my_dict.pop(key)
#                 print(f"Deleted key: {key}")
#             else:
#                 print("Key not found. Cannot delete.")
        
#         elif oper == "exit":
#             print("Exiting the program.")
#             break
        
#         else:
#             print("Invalid operation. Please enter 'add', 'search', 'delete', or 'exit'.")

# handle_dictionary()
