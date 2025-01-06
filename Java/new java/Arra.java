import java.util.Scanner;
import java.util.Arrays;

public class Arra{

    public static void main(String[] args) {
        
        int[] ros= new int[5];
        Scanner sc=new Scanner(System.in);

        //  ros[0]=10;
        //  ros[1]=20;
        //  ros[2]=30;
        //  ros[3]=40;
        //  ros[4]=50;

        // System.out.println(ros[2]);

        for(int i=0;i<ros.length;i++){

            ros[i]=sc.nextInt();

        }

        // for(int i=0;i<ros.length;i++){

        //  System.out.print(ros[i] + " ");

        // }


        // for(int num: ros){   // for each loop
        //     System.out.print(num+" ");     // num(reference variable) represents the element in the array
        // }

        System.out.println(Arrays.toString(ros));
        
        chang(ros);
        System.out.println(Arrays.toString(ros));

        

    }

    static void chang(int[] arr){
        arr[0]=99;
    }
    
}
