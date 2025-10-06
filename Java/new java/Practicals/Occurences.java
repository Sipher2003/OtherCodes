import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Occurences {

    public static void main(String[] args) {
        String s="football";
        // System.out.println(countOCC(s));
        System.out.println(countocc2(s));
    }

    static String countOCC(String s){
        
      StringBuilder sb=new StringBuilder();
      char[] word=s.toCharArray();
      HashSet<Character> set=new HashSet<>();

       for (int i = 0; i < word.length; i++) {
        int counter=1;
        char temp=word[i];
        if(set.contains(temp)){
            continue;
        }
        for (int j = i+1; j < word.length; j++) {
            if(word[j]==temp){
                counter+=1;
                set.add(temp);
            }
        }
        sb.append(temp);
        sb.append(counter);
       } 
        
        
        return sb.toString();
    }


    static String countocc2(String s){
    
    HashMap<Character,Integer>map=new LinkedHashMap<>();


    for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c, 0)+1);
    }
    StringBuilder sb=new StringBuilder();

    for(char c :map.keySet()){
        sb.append(c);
        sb.append(map.get(c));
    }

      
    
        return sb.toString();

    }
    
}
