public class Inter {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.call();
        m.pic();

    }
}

interface phone{
    void call();
}

interface camera{
    void pic();
}

class Mobile implements phone,camera{
    public void call(){
        System.out.println("Calls");
    }

    public void pic(){
        System.out.println("Picture taken");
    }
}