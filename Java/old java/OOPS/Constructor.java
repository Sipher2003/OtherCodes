public class Constructor {
    public static void main(String[] args) {
        Student s=new Student("Kaustubh");
        s.display();
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
