def calculate_marks(marks):
    if marks > 80:
        return "O"
    elif (marks<=80 and marks>=70):
        return "A+"
    elif (marks<=70 and marks>=60):
        return "A"
    elif (marks<=60 and marks>=50):
        return "B+"
    elif (marks<=50 and marks>=60):
        return "B"
    else:
        return "poor"
    
marks=int(input("Enter ur marks out of 100: "))

grade=calculate_marks(marks)
print(f"Your grade is {grade}")

