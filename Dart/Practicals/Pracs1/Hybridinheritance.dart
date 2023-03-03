void main() {
  bman b1 = bman();
  b1.age=55;
  b1.name="Karan";
  b1.display4();
  manager m1 = manager();
  m1.name="Baman";
  m1.empid=101;
  m1.posn="Manager";
  m1.display3();
}

class person{
    String name="";
    
    void display(){
      print("Name is ${name}");    //can also write $name
    }
  }
  
class employee extends person{
  int empid=0;
  void display2(){
    print("Name is ${name} and id is $empid}");
  }
}

class manager extends employee{
  String posn="";
  void display3(){
    print("Name is ${name} and position is ${posn} and empid is${empid}");
  }
}

class bman extends person{
  int age=0;
  void display4(){
    print("Name is ${name} and age is ${age}");
  }
}
