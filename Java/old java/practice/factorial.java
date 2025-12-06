public class factorial{
    public static void main(String[] args) {
        System.out.println(fact(50));
    }

    static long fact(int n){
        if(n==0 || n==1){
            return n;
        }

        long f=1;
        for (int i = 2; i <=n; i++) {
            f*=i;
        }
        
        return f;

    }
}