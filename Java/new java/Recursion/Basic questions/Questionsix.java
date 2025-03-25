public class Questionsix {
    public static void main(String[] args) {
        // System.out.println(revnum(1234));
        recreverse(1234);
        System.out.println(rev);
    }

    static int revnum(int num){
        
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        return sum;
    }

   static int rev=0;

    static void recreverse(int num){
        if(num==0){
            return;
        }
            int rem=num%10;
            rev=rev*10+rem;
            recreverse(num/10);
        
        
    }

}
