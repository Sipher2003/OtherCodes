public class ReadIntegerFromCommandLine {
    public static void main(String ar[]) {

  
        int firstNum = Integer.parseInt(ar[0]);
        int secNum = Integer.parseInt(ar[1]);
        int sum = firstNum + secNum;

        System.out.println("First Number = " + firstNum);
        System.out.println("Second Number = " + secNum);
        System.out.println("Addition Of Two Numbers = " + sum);

        String str1 = ar[2];
        System.out.println("str is: " + str1);

    }
}