public class Questionseven {
    public static void main(String[] args) {
        System.out.println(pal(121));
    }

    static boolean pal(int num){
        int org=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        return sum==org;

    }
}
