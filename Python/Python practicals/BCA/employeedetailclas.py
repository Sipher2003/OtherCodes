class Employee:
    TotalSal = 0
    def __init__(self,empId,dept,designation,basicSalary,incentives):
        self.empId=empId
        self.dept=dept
        self.designation=designation
        self.basicSalary=basicSalary
        self.incentives=incentives
       
    def calcTotSal(self):
        self.TotalSal=self.basicSalary+self.incentives

    def displayDetails(self):
        print("Employee ID:",self.empId)
        print("Employee Department:",self.dept)
        print("Employee Designation:",self.designation)
        print("Basic Salary:",self.basicSalary,"rupees")
        print("Incentives:",self.incentives,"rupees")
        print("Total Salary:",self.TotalSal,"rupees")
        print("- - - - - - - - - - - - -")
       

print("Enter number of employees: ")
n=int(input())
counter=0
emp=[]
for i in range(0,n):
    print("Enter details for Employee: ",i+1)
    print("Enter Employee ID: ")
    empId=int(input())
    print("Enter Employee Department: ")
    dept =input()
    print("Enter Employee Designation: ")
    designation =input()
    print("Enter Employee Basic Salary: ")
    basicSalary = float(input())
    print("Enter Employee Incentives: ")
    incentives= float(input())
    emp.append(Employee(empId,dept,designation,basicSalary,incentives))

counter=0
for i in range(0,n):
    emp[counter].calcTotSal()
    emp[counter].displayDetails()
    counter+=1
