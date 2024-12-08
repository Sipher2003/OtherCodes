// linkedinlist 5 elements

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Pracs1B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemnts");
        int num=sc.nextInt();

        LinkedList<String> l1=new LinkedList<>();

        System.out.println("Enter the elements in the linkedlist");
        for(int i=0;i<num;i++){
            System.out.println("Enter elem "+(i+1)+" :");
            String inp=sc.next();
            l1.add(inp);

        }

        System.out.println("Elements in forward are");
        ListIterator<String> itr=l1.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        System.out.println("Elements in backward are");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

    }
}
