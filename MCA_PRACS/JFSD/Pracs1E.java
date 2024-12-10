import java.util.HashMap;

class Customer {
    private int accno;
    private String name;

    public Customer(int accno, String name) {
        this.accno = accno;
        this.name = name;
    }

    // Getters
    public int getAccno() {
        return accno;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Acc no=" + accno + " and name is " + name + ".";
    }
}

public class Pracs1E {
    public static void main(String[] args) {

        HashMap<Integer, Customer> cmap = new HashMap<>();

        cmap.put(101, new Customer(101, "John Doe"));
        cmap.put(102, new Customer(102, "Jane Smith"));
        cmap.put(103, new Customer(103, "Alice Brown"));

        // Printing all elements in the HashMap
        for (Integer key : cmap.keySet()) {
            System.out.println(key + " => " + cmap.get(key));
        }

        // Check if the element with account number 101 is present
        if (cmap.containsKey(101)) {
            System.out.println("\nCustomer with account number 101 is present.");
            // Print details of customer with account number 101
            System.out.println("Details of Customer 101: " + cmap.get(101));
        } else {
            System.out.println("\nCustomer with account number 101 is not present.");
        }
    }
}
