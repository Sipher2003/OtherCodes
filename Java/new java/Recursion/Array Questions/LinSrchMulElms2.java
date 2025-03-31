import java.util.ArrayList;

public class LinSrchMulElms2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5 };
        System.out.println(Elms(arr, 4, 0));
    }

    // solving the question by initializing an arraylist in the function instead of
    // passing it in the arguments
    static ArrayList<Integer> Elms(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansfrombelow = Elms(arr, target, index + 1);
        list.addAll(ansfrombelow);
        return list;
    }
}
