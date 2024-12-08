#3 grade

def calculate_grade(marks):
    average=sum(marks)/len(marks)

    if average >= 90:
        grade = 'A'
    elif average >= 80:
        grade = 'B'
    elif average >= 70:
        grade = 'C'
    elif average >= 60:
        grade = 'D'
    elif average >= 50:
        grade = 'E'
    else:
        grade = 'F' 
    return average,grade


marks=[]

for i in range(1,4):
    while True:
        try:
            mark=float(input(f"Enter marks for subject {i}:"))
            if 0<=mark<=100:
                marks.append(mark)
                break
            else:
                print("Enter marks between 1-100")
        except ValueError:
            print("Invalid input")


average,grade=calculate_grade(marks)
print(f"Average is{average:.2f} and grade is {grade}")

