public class Questiontwo {
    public static void main(String[] args) {
        fib2(5);
    }

    static void fib2(int n){
       if(n==0){
        return;
       }

       fib2(n-1);
       System.out.println(n);
    }
}
