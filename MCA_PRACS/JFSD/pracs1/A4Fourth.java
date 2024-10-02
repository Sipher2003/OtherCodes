// Assignments on Set Interface
// 1. Write a Java program using Set interface containing list of items and perform the 
// following operations:
//  a. Add items in the set. 
//  b. Insert items of one set in to other set. 
//  c. Remove items from the set 
//  d. Search the specified item in the set.

import java.util.HashSet;
import java.util.Set;

public class A4Fourth {
    public static void main(String[] args) {
        // Create two sets
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // Add items to set1
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        // Add items to set2
        set2.add("grape");
        set2.add("mango");

        // Insert items of set2 into set1
        set1.addAll(set2);

        // Remove an item from set1
        set1.remove("banana");

        // Search for an item in set1
        boolean containsApple = set1.contains("apple");
        boolean containsPear = set1.contains("pear");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Does set1 contain apple? " + containsApple);
        System.out.println("Does set1 contain pear? " + containsPear);
    }
}