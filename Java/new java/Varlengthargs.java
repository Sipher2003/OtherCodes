import java.util.Arrays;

public class Varlengthargs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8);
    }

    static void fun(int ...v){        //variable length arguments

        System.out.println(Arrays.toString(v));

    }
}
