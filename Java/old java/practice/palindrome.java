public class palindrome {
    public static void main(String[] args) {
   System.out.println(pal(123));
    }

    static boolean pal(int n) {
        // 121
        int sum = 0;

        int temp = n;
            while (temp>0) {
            int last = temp % 10;
            sum =(sum*10)+ last;
            temp /= 10;
            }
       

        return sum==n;

    }
}
