
// 2. Create a LinkedList of type String add 5 elements and traverse the list and from both sides
import java.util.*;
public class A2Second {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number String Elements");
        int n=sc.nextInt();
        LinkedList<String> a1= new LinkedList<String>();
        {


            System.out.println("Enter elements for the array: ");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                String element = sc.next();
                a1.add(element);
            }
            ListIterator<String> itr=a1.listIterator();
            System.out.println("\nTraversing elements in forward direction: ");
            while (itr.hasNext() ) {
                System.out.println(itr.next());
            }
            System.out.println("\n Traversing elements in backward direction: ");
            while(itr.hasPrevious())
            {
                System.out.println(itr.previous());
            }
        }
    }
}