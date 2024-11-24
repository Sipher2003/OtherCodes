import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Setin {

    public static void main(String[] args) {
        Set <Integer> age=new HashSet<>();
        Set <Integer> newage=new HashSet<>();

        age.add(9);
        age.add(19);
        age.add(29);
        System.out.println(age);

        newage.add(11);
        newage.addAll(age);
        System.out.println("after combining both sets "+newage);
        
        newage.remove(11);
        System.out.println("after removing "+newage);

        Scanner inp=new Scanner(System.in);
        int item=inp.nextInt();


        if(newage.contains(item)){
            System.out.println("Item is available");

        }
        else{
            System.out.println("item isnt available");
        }
    }
    
}
