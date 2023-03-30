public class finall {
    
    public static void main(String[] args){

        int[] a=new int[5];
        try{
            a[-2]=4;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of bound");
            System.out.println(e);
        }
        finally{
            a[2]=5;
            System.out.println("The value is "+a[2]);
            System.out.println("The finally block is executed");
        }
        
    }
}
