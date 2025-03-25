public class Questioneight {
    public static void main(String[] args) {
        // System.out.println(zerocount(30204));
        reczerocount(30204);
        System.out.println(count);
    }
//30204
    static int zerocount(int num){
        int count=0;
        while (num>0) {
            int rem=num%10;
            if(rem==0){
                count+=1;
            }
            num/=10;
        }        
        return count;
    }
    
    static int count=0;
    static void reczerocount(int n){
      if(n==0){
        return;
      }
      int rem=n%10;
      if(rem==0){
          count+=1;
      }
      reczerocount(n/10);

    }
}
