// 3. Create an employee class (id, name, salary) create an Arralist of type employee, add 5 employee, traverse the
// ArrayList and print the elements, Remove one element and print the list
import java.util.ArrayList;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee" +
                "Id = " + id +
                ", Name = " + name +
                ", Salary = " + salary +
                ' ';
    }
}

public class A3Third {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Alice", 50000));
        employees.add(new Employee(2, "Bob", 60000));
        employees.add(new Employee(3, "Charlie", 70000));
        employees.add(new Employee(4, "David", 80000));
        employees.add(new Employee(5, "Eve", 90000));

        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Remove the employee with id 3
        employees.removeIf(employee -> employee.id == 3);

        System.out.println("\nEmployees after removing employee with id 3:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
