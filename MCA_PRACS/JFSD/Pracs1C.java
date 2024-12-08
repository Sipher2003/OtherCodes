import java.util.ArrayList;

class Employee {
    int id;
    String name;
    Double salary;

    public Employee(int id,     //constructor
            String name,
            Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    // @Override
    // public String toString() {
    //     return "Employee" +
    //             "Id = " + id +
    //             ", Name = " + name +
    //             ", Salary = " + salary +
    //             ' ';
    // }

}

public class Pracs1C {
    public static void main(String[] args) {

        ArrayList<Employee>a1=new ArrayList<>();
        a1.add(new Employee(1,"Kausy", 50000.00));
        a1.add(new Employee(2,"Kay", 45000.00));
        a1.add(new Employee(3,"Kasy", 21000.00));
        a1.add(new Employee(4,"adusy", 78000.00));
        a1.add(new Employee(5,"ufsy", 34000.00));

        System.out.println("Employees are");
        for(Employee employee:a1){
            System.out.println(employee);
        }

        a1.removeIf(employee -> employee.id == 3);
        System.out.println("After removing");
        for(Employee employee:a1){
            System.out.println(employee);
        }


    }

}
