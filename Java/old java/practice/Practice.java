import java.util.*;

public class Practice {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Please enter the array size: ");
        // int size=sc.nextInt();
        // int[] arr=new int[size];

        // for (int i = 0; i < size; i++) {
        // arr[i]=sc.nextInt();
        // }

        // System.out.println("the array is "+Arrays.toString(arr));

        // Scanner sc=new Scanner(System.in);

        // System.out.println("Enter the number of months");
        // int months=sc.nextInt();

        // if(months%3==0){
        // System.out.println(months/3 * 5000);
        // }

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the array size");
        // int len=sc.nextInt();
        // int[] nums=new int[len];

        // for (int i = 0; i < nums.length; i++) {
        // nums[i]=sc.nextInt();
        // }
        // ArrayList<Integer> list =new ArrayList<>();

        // int maxsum=nums[0];
        // int cursum=0;

        // for(int num:nums){
        // list.add(num);
        // if (cursum<0){
        // cursum=0;
        // list.clear();
        // }
        // cursum+=num;
        // maxsum=Math.max(maxsum, cursum);
        // }
        // System.out.println("The array is "+list+"and the maxsum is "+maxsum);

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // int size=sc.nextInt();
        // int[] arr=new int[size];

        // int sum=0;
        // for (int i = 0; i < arr.length; i++) {
        // arr[i]=sc.nextInt();
        // sum+=arr[i];
        // }

        // System.out.println(sum);
        // System.out.println(sum/size);

        // palindome between range

        // System.out.println("Enter number 1: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter number 2: ");
        // int num2 = sc.nextInt();
        
        // for (int i = num1; i <= num2; i++) {
            //  if (pal(i)){
                //    System.out.print(i+" ");
                //  }
                // }
                
                // Scanner sc = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the array size");
        // int len=sc.nextInt();
        // int[] nums=new int[len];
        // int sum=0;

        // for (int i = 0; i < nums.length; i++) {
        //     nums[i]=sc.nextInt();
        //     sum+=nums[i];
        // }
        

        // ArrayList<Integer> list=new ArrayList<>();
        // ArrayList<Integer> list2=new ArrayList<>();

        // int counter=0;
        // int total=0;
        // for (int i = 0; i < nums.length; i++) {
        //     total+=nums[i];
        //     list.add(nums[i]); 
        //     if(total==(sum/2)){
        //         counter=i;
        //         break;
        //     }
        // }

        // for (int i = counter+1; i < nums.length; i++) {
            
        // }
        // int[] ans1=list.stream().mapToInt(Integer::intValue).toArray();
        // System.out.println(Arrays.toString(ans1));


        int num=sc.nextInt();

        if(perfnum(num)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }







    }

    static boolean pal(int num) {
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
            if (temp == sum) {
                return true;
            }
        }
        return false;
    }

    static boolean perfnum(int num){
        int sum=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0){
                sum+=i;
            }
            if(sum==num){
                return true;
            }
        }
        
        return false;  
    }

}