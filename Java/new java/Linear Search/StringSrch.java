public class StringSrch {

    public static void main(String[] args) {
        String name = "Kaustubh";
        char target = 's';

        System.out.println(srchStr(name, target));

    }

    static boolean srchStr(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;

    }

}
