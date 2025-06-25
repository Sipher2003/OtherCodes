public class SkipString {

    public static void main(String[] args) {
        Subseq("","habbcada");
    }

    //skip a character
    static void Skip(String p,String up){
         if(up.isEmpty()){
            System.out.println(p);
            return;
         }

         char ch=up.charAt(0);

         if(ch=='a'){
            Skip(p, up.substring(1));
         }else{
            Skip(p+ch, up.substring(1));
         }
    }

    static void Subseq(String p,String up){
      if(up.isEmpty()){
         System.out.println(p);
         return;
      }

      char ch=up.charAt(0);
      Subseq(p+ch, up.substring(1));
      Subseq(p, up.substring(1));
    }


    
}