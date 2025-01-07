import java.util.ArrayList;
import java.util.Scanner;

public class ArrListExample {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // ArrayList<Integer> list=new ArrayList<>(5);   //initial capacity doesnt matter


        // for (int i = 0; i < 5; i++) {
        //     list.add(sc.nextInt());
        // }

        // for (int i = 0; i < 5; i++) {
        //     System.out.println(list.get(i));
        // }

        // System.out.println(list);


        //multidimension

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        } 

        //add

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              list.get(i).add(sc.nextInt());  
            }
            
        }

        System.out.println(list);

    }
    
}
