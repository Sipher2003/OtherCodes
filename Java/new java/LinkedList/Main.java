public class Main {

    public static void main(String[] args) {
        LL list=new LL();
        // list.Insertfirst(10);
        // list.Insertfirst(20);
        // list.Insertfirst(30);
        // list.Insertfirst(40);
        // list.Insertfirst(50);
        list.Insertlast(10);
        list.Insertlast(20);
        list.Insertlast(30);
        list.Insertlast(40);
        list.Insertlast(50);
        list.Insertlast(60);

        list.insert(35, 3);

        list.display();
        System.out.println(list.deletefirst());
        list.display();
    }
    
}
