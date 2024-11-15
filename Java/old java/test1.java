public class test1 {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Your age is less");
        else
            System.out.println("You are valid to vote");
    }

    public static void main(String[] args) {

        validate(13);
        System.out.println("Rest of the code");
    }
}
