// setinterface

import java.util.HashSet;
import java.util.Set;

public class Pracs1D {
    public static void main(String[] args) {
        Set<String>set1=new HashSet<>();
        Set<String>set2=new HashSet<>();

        set1.add("apple");
        set1.add("banana");
        set1.add("mango");

        set2.add("carrot");
        set2.add("tomato");
        System.out.println(set1);
        System.out.println(set2);
        
        set2.addAll(set1);
        System.out.println(set2);

        set2.remove("banana");
        System.out.println(set2);

        boolean containsguava=set2.contains("Guava");
        System.out.println("Contains guava "+(containsguava));

    }
    
}
