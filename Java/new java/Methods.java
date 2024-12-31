import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        // System.out.println("hello world");
        // msg();
        int a =10;
        int b=20;

        swap(a, b);
        
        System.out.println("Value of a is "+a+" and b is  "+b);
        
    }
    


    static void msg(){
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();

        System.out.println("hello "+name);
        System.out.println(sum());
    }


    static int sum(){
        int a =10;
        int b =20;

        int summ = a+b;
        return summ;
    }

    static void swap(int a , int b){
        int temp =a;
        a=b;
        b=temp;
    }
}
