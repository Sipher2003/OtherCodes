public class Questionthree {

    public static void main(String[] args) {
        fibo3(5);
    }


    static void fibo3(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        fibo3(n-1);
        System.out.println(n);
    }
    
}
