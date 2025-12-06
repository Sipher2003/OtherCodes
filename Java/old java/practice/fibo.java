import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {
    int f=0;
    int s=1;
   
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the number of fibo series: ");
    int n=sc.nextInt();

    for (int i = 1; i <=n; i++) {
        System.out.print(f+"  ");
       int next=f+s;
        f=s;
        s=next;
    }

    // System.out.println("the fibo number is "+fib(6));
    }

    static int fib(int n){
        int f=0;
        int s=1;

        for (int i = 1; i <n; i++) {
          int next=f+s;
          f=s;
          s=next;    
        }
        
        return f;
    }

    
    
}
