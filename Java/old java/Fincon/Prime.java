public class Prime {
    public static void main(String[] args) {
        System.out.println(prm(2));
        System.out.println(prm(3));
        System.out.println(prm(5));
        System.out.println(prm(6));
        prm2(20);
    }

    static boolean prm(int num){
        if(num<=1){
            return false;
        }
        if(num==2){
            return false;
        }
        if(num%2==0){
            return false;
        }

        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    static void prm2(int n){
        for (int i = 2; i <=n; i++) {
            if(prm(i)){
                System.out.print(i+" ");
            }
System.out.println();
        }
    }
}
