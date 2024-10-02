// Assignments on Map Interface
// 1. Create a class Customer(Account_no Integer, Name Sting), 
// Create a HashMap of type Customer put elements, print elements, 
// check if element with account number 101 is present or not? What is the value for Customer 101.
import java.util.HashMap;
import java.util.Map;

class Customer {
    Integer accountNo;
    String name;

    public Customer(Integer accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer " + "accountNo = " + accountNo + ", name = " + name;
    }
}

public class A5Fifth {
    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();

        // Add customers to the map
        customers.put(101, new Customer(101, "Tejas"));
        customers.put(102, new Customer(102, "Bhoomi"));
        customers.put(103, new Customer(103, "Kausy"));

        // Print all customers
        System.out.println("Customers:");
        // for (Map.Entry<Integer, Customer> entry : customers.entrySet()) {
        // System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }

        boolean containsCustomer101 = customers.containsKey(101);
        System.out.println("Does the map contain customer 101? " + containsCustomer101);

        Customer customer101 = customers.get(101);
        if (customer101 != null) {
            System.out.println("Customer 101: " + customer101);
        } else {
            System.out.println("Customer 101 not found.");
        }
    }
}
