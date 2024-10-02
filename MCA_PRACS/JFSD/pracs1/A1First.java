package Practical_1;

// 1. Create an ArrayList of type Interger, add element into it traverse the arraylist and print the elements
import java.util.ArrayList;
import java.util.Scanner;


public class A1First {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();


        ArrayList<Integer> a1 = new ArrayList<Integer>();


        System.out.println("Enter elements for the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = sc.nextInt();
            a1.add(element);
        }


        System.out.println("Elements of the ArrayList are: ");
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
    }

}