import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterat {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);

        Iterator<Integer> it= list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //it.remove()
    }
}
