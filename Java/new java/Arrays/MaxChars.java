import java.util.ArrayList;
import java.util.HashMap;

public class MaxChars {
    public static void main(String[] args) {
        System.out.println(repeatelems("Sharma"));
    }

    static ArrayList repeatelems(String name){
        // char temp='a';

        HashMap<Character,Integer>map=new HashMap<>();
        ArrayList<Character> list=new ArrayList<>();

        for(char c: name.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char temp2:map.keySet()){
            if(map.get(temp2)>1){
           list.add(temp2);
            }
        }
        
        return list;
    }
}
