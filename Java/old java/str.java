import java.util.*;

public class str {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char res = str1.charAt(2);
        
        
        System.out.println(res);
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.concat(str2));
        System.out.println(str1.length());
    }
}
