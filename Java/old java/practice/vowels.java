import java.util.HashSet;
import java.util.Scanner;

public class vowels {

    public static void main(String[] args) {
        System.out.println(vow('a'));
    }

    static boolean vow(char n){
        
        HashSet<Character> set =new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        if(set.contains(Character.toLowerCase(n))){
            return true;
        }
        
        return false;
    }
    
}
