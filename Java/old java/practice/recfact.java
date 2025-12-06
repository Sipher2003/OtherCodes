public class recfact {
    public static void main(String[] args) {
        System.out.println(recfac(20));
    }

    static long recfac(int n){
        if(n==0 || n==1){ //base condition
            return n;
        }

        return n*recfac(n-1);
    }
    
}
