public class Patterns {

    public static void main(String[] args) {
        ptrn1(5);
    }

    static void ptrn1(int n){
        for (int i = 1; i <=n; i++) {
            int spaces=n-1;
        if(i<n){
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        else{
            for (int j = 1; j <=n; j++) {
                System.out.print(" *");
            }
        }
            // System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <n; j++) {
                System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println();
        }
    }
    
}
