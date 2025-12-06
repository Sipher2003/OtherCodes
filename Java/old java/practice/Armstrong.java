public class Armstrong {

    public static void main(String[] args) {
        System.out.println(arms(154));
    }

    static boolean arms(int n){
        int temp=n;
        int len=String.valueOf(n).length();
        int sum=0;

        while (temp>0) {
            int l=temp%10;
            sum+=Math.pow(l, len);
            temp /=10;
        }
        
        return sum==n;
    }
    
}
