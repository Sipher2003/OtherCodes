// class A {
// int age=0;

//  void set stud_age(int age) {
//  if(age<= 0) {
//  print("Age should be greater than 0");
//  } else {
//  this.age = age;
//  }
//  }
 
//  int get stud_age {
//  return age; 
//  }
// } 



// class constructor{

// constructor(String name,int age){
//   print("$name,$age");
// }

// constructor.details(String address,int sal){
//   print("$sal,$address");

// }

// }
class A{
String name="Hello";
void display(){
  print("Name is $name");
}
}

class B extends A{
int age=89;
void display2(){
  print("Name is $name and age is $age");
}
}

class C extends B{
double salary=4789.90;
void display3(){
  print("name is $name age is $age and salary is $salary");
}
}

void main(){
C c1=C();
c1.display3();


}

// print("hello world");
// int a=10;

// String plat,abc="Helllo Worrld";

// print(a);
// // print(plat);
// print(abc);

// final a=10;

// final int b =10;

// print("Sum of a and b is ${a+b}");

// num a=10;
// print(a);

// String a="Hello";
// String b="World";

// print(a+b);

// bool val=(a!=b);
// print(val);

// List a=["Hello",1,78,9.39,true];

// for (var hell in a) {
//   print(hell);
// }

// int num1=30;
// int num2=20;
// int num3=60;

// if(num1>num2){
//   if(num1>num3){
//     print("num1 is greatest");
//   }
//   else{
//     print("num3 is greatest");
//   }
// }
// else{
//   if(num2>num3){
//     print("num2 is greatest");
//   }
//   else{
//     print("num3 is greatest");
//   }

// var grade=1;

// switch(grade){

// case 1:{
//   print("100");
//   break;
// }

// case 2:{
//   print("200");
//   break;
// }

// default:{
//   print("invald");
//   break;
// }

// int num=5;
// int a=1;
// int i=1;
// while(i<=num){
//   a*=i;
//   i++;
// }

// print(a);

//labels

    // outerloop:for (int i = 1; i <= 3; i++) {
    //   innerloop:for (int j = 1; j <= 3; j++) {
    //     print("$i,$j");
    //     if (i == 2 && j == 2) {
    //       break outerloop;
    //     }
    //   }
    // }
// test(1,s1: 'hello',s2: 3);

// var abc=List<int>.filled(5, 200,growable: true);
// print(abc);
// abc.replaceRange(2, 4,[100,120]);
// print(abc);

// Map a1={
// "Name":"Kaustubh",
// "Age":19,
// "education":"bca"
// };

// print(a1);
// a1["salary"]=10000;
// print(a1);
// print(a1['Name']);

// a1.forEach((key, value) {print("$key,$value");});
  // }
