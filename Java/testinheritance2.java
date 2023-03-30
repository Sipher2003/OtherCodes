class grandparent {

    void add() {

        System.out.println("Laughing");
    }
}

class parent extends grandparent {

    void sub() {

        System.out.println("smiling");
    }
}

class child extends parent {

    void mul() {

        System.out.println("Jumping");

    }
}

public class testinheritance2 {

    public static void main(String[] args){
child c1=new child();
 c1.mul();
 c1.add();
 c1.sub();




    }

}
