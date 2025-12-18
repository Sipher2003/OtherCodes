public class Prime2 {
    public static void main(String[] args) {
        prm(20);
    }

    static void prm(int n){
        
        for (int num = 2; num <=n; num++) {
            boolean isnum=true;
            for (int i = 2; i*i <=num; i++) {
                if(num%i==0){
                 isnum=false;
                 break;
                }
            }
            if(isnum){
                System.out.print(num+" ");
            }
        }
System.out.println();
    }
}
