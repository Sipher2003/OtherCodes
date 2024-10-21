def manage_dictionary():
    d = {}
    while True:
        action = input("Choose action: add, search, delete, exit: ").strip().lower()
        if action == "add":
            key = input("Enter key: ")
            value = input("Enter value: ")
            d[key] = value
        elif action == "search":
            key = input("Enter key to search: ")
            print("Value:", d.get(key, "Key not found."))
        elif action == "delete":
            key = input("Enter key to delete: ")
            d.pop(key, None)  # Removes the key if it exists
        elif action == "exit":
            break
        else:
            print("Invalid action.")

# Uncomment to run
# manage_dictionary()
