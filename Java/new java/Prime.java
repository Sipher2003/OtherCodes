public class Prime {

    public static void main(String[] args) {
        // System.out.println("hello");

        System.out.println(isPrm(6));
    }

    static boolean isPrm(int n){
        if(n<=1){
            return false;
        }

        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;   //any return statement after execution ends the method 
            }
        }
        return true;
    }
}
