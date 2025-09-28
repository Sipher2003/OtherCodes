// import java.util.Arrays;
// import java.util.Scanner;
 import java.util.*;

public class Practice2 {

    public static void main(String[] args) {
       

        int[] arr= new int[5];
        
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++){
            int num=sc.nextInt();
            arr[i]=num;
        }

        Arrays.sort(arr);
        
        System.out.println("The second largest element is "+arr[arr.length-2]);
  
    }
    
}
