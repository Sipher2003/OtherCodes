import java.util.ArrayList;

public class LinSrchMultipleElms {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(Elms(arr, 4, 0, numbers));
    }
//[1,2,3,4,4,5]
    static ArrayList<Integer> Elms(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }
        
        return Elms(arr, target, index+1, list);
    }
}
