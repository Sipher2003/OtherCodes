public class Constructor {
    public static void main(String[] args) {
        Student s=new Student("Kaustubh");
        s.display();

        Donkey a=new Donkey("cat");
        a.show();
    }


}

class Student{
String name;
    Student(String name){
  this.name=name;     
    }

    void display(){
        System.out.println("the name is "+name);
    }
}

class Donkey{
    String name;
  Donkey(String name){
   this.name=name;
  }

  void show(){
    System.out.println(name);
  }
}
