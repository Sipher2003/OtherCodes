public class Questionone {

     public static void main(String[] args) {
        fib1(5);
     }

     static void fib1(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        fib1(n-1);

     }
}