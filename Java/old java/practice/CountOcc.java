import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CountOcc {
    public static void main(String[] args) {
        // System.out.println(occ("Hello World Hello,World , Hello"));
        System.out.println(occ2("Hello World Hello World Hello"));
    }

    static  ArrayList<Integer> occ(String s){

        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();

        String[] arr= s.split("\\s+");

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(String t:map.keySet()){
         list.add(map.get(t));
        }

        return list;
        
    }

    static ArrayList<Integer> occ2(String s){

        String[] arr=s.split(" ");
        HashSet<String> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int c=1;
            String temp=arr[i];
            if (set.contains(temp)) {
                continue;
            }
           for (int j = i+1; j < arr.length; j++) {
            if(arr[j].equals(temp)){
                c+=1;
            }
            set.add(temp);
        }
        ans.add(c);


        }

        return ans;
    }
}
