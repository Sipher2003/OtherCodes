import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {
        // Perms("", "abc");
        System.out.println(Perms2("", "abc"));
    }

    static void Perms(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f =p.substring(0, i);
            String s=p.substring(i,p.length());
            Perms(f+ch+s,up.substring(1));
        }

    }


    //return in an Arraylist
    static ArrayList<String> Perms2(String p,String up){
        if(up.isEmpty()){
            // System.out.println(p);
            // return;
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }

            ArrayList<String>ans=new ArrayList<>();

        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            ans.addAll(Perms2(f+ch+s, up.substring(1)));
        }
        return ans;
    }
}