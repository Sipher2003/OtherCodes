public class Maxamong3 {
    public static void main(String[] args) {
        // int a=5;
        // int b=100;
        // int c=15;

        // if(a>b && a>c){
        //     System.out.println("A is the largest");
        // }else if(b>a && b>c){
        //     System.out.println("B is the largest");
        // }
        // else{
        //     System.out.println("C is the largest");
        // }
        int[] arr={1,3,8,4,2};

        System.out.println(maxnum(arr));
        
    }

    static int maxnum(int [] arr){
       int max=0;

       for (int i = 0; i < arr.length; i++) {
        max=Math.max(max,arr[i]);
       }

        return max;
    }
}
