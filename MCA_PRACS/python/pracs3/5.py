students = {
    "Student1": {"name": "Nin", "address": "123 St", "age": 20, "class": "A", "marks": [85, 90, 80, 75, 95]},
    "Student2": {"name": "Kaus", "address": "456 St", "age": 21, "class": "B", "marks": [78, 82, 88, 84, 79]},
    "Student3": {"name": "Teja", "address": "789 St", "age": 22, "class": "C", "marks": [90, 91, 92, 89, 93]},
    "Student4": {"name": "Sean", "address": "321 St", "age": 23, "class": "D", "marks": [70, 75, 80, 65, 72]},
    "Student5": {"name": "Hamdeez", "address": "654 St", "age": 24, "class": "E", "marks": [88, 89, 90, 91, 92]},
    "Student6": {"name": "Freeni", "address": "654 St", "age": 24, "class": "F", "marks": [88, 89, 90, 91, 92]},
    "Student7": {"name": "biraj", "address": "654 St", "age": 24, "class": "G", "marks": [88, 89, 90, 91, 92]},
}

# Example operations
def print_students_info():
    for student_id, info in students.items():
        print(student_id, ":", info)

print_students_info()
