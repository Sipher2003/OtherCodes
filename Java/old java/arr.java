public class arr {

    public static void main(String[] args) {
        int mylist[] = { 1, 3, 5, 7, 9, 11, 13, 15 };

        for (int i = 0; i < mylist.length; i++) {
              System.out.println(" "+mylist[i]);
        }

        int total=0;
        for (int i = 0; i < mylist.length; i++) {
            total +=mylist[i];
        }
        System.out.println(" "+total);
    }
}
