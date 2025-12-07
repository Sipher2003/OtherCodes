public class Exceptionhandling {
    public static void main(String[] args) {
        Excep1();
        Excep2();
    }
// ArithmeticExpression e dividebyzero
    static void Excep1(){
        int a=10;
        int b=0;

        try{
            int ans=a/b;
        }catch(ArithmeticException e){
            System.out.println("The error is "+e);
        }
    }

//Indexoutofbounds
static void Excep2(){
    int[] arr={1,2,3};

    try{
        int b=arr[5];
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The error is "+e);
    }finally{
        System.out.println("This block executes");
    }
}
}
