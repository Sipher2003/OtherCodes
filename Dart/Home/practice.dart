// import 'dart:io';
 
void main()
{
    // print("Enter your name?");
    
    // String? name = stdin.readLineSync();
 
    
    // print("Hello, $name! ");
    

    // int a=10;
    // double b=9.9;
    // bool c=false;
    // String d,e="Hello World";


    // print(a);
    // print(b);
    // print(c);
    // // print(d);
    // print (e);


    // int num1=8;

    // if (num1 % 2 == 0){
    //   print("Even");
    // }
    // else{
    //   print("odd");

    // }

// int a=18;



// print(a);


// var c1=num.parse("1" );
// var c2=num.parse("3.14");


// var c3=c1+c2;

// print(c3);

// String s1="Hello";

// String s2="World";

// print(s1);
// print(s2);

// print(s1+s2);


// String str="Hello";
// String str2="Hell";

// bool c1=(str==str2);

// print(c1);

// int a=10;
// int b=20;
// int c=30;



// if(a>b){
//   if(a>c){
//     print("${a} is greatest");
//   }
//   else{
//     print("${c} is greatest");
//   }
// }
// else{
//   if(b>c){
//     print('${b} is greatest');
//   }
//   else{
//     print("${c} is greatest");

//   }
// }



// int num=9;


// switch(num){
  
//   case 1:
//   {print("Sunday");}
//   break;

//   case 2:
//   {print("Monday");}
//   break;

//   case 3:
//   {print("Tuesday");}
//   break;

//   case 4:
//   {print("Wednesday");}
//   break;

//   case 5:
//   {print("Thursday");}
//   break;

//   case 6:
//   {print("Friday");}
//   break;

//   case 7:
//   {print("Saturday");}
//   break;

// default:
// {print("invalid");}
// break;



// }

// for(int i=10;i<=100;i++){
//   print(i);
// }

// List a1=[1,2,3,3,4];


// for(var a2 in a1){
//   print(a2);
// }

// int i=1;
// while(i<100){
// if(i%2==0){
//   print(i);
// i++;
// }
// }

// outerloop:

// for(int i=1;i<=10;i++){
//   print(i);
//   innerloop:
//      for(int j=1;j<=10;j++){

//       if(j==4){
//         break outerloop;
//       }
//       if(j==6){
//         break innerloop;
//       }
//       print(j);
//      }
// }
   
//    int i=1;
//    var list1=[7,2,3,4,5];


//    for(var num1 in list1){
//     print("Element ${i} is ${num1}");
//     i++;
//    }

// int min=list1[0];

// for(int i=0;i<list1.length;i++){
// if(list1[i]<min){
//   min=list1[i];
// }
// }

// print("Minimum is ${min}");

// print(factorial(3));


// var list1=new List<int>.filled(5,100,growable: true);


// list1.add(800);
// print(list1[5]);
// print(list1);
// print("Reversed is ${list1.reversed}");
// print("Length is ${list1.length}");
// // list1.replaceRange(start, end, replacements)

// var list2=[569];
// print("Single  function output is ${list2.single}");


// final int a=10;

// print(a is double);


// fact f1=new fact();

// f1.calcfact(4);

// for (int i=1;i<=10;i++){

//   if(i==5){
//     continue;
//   }
//   print(i);
// }


// outerloop:
// for(int i=1;i<=10;i++){

// innerloop:
// for (int j=1;j<=10;j++){

// if (i==6){
//   break innerloop;
// }

// if(i==5){
//   break outerloop;
// }


// print("innerloop ${j}");
// }

// }


// numm(4,s2: 'hello');
// numm(4,s2: 'hello',s3:'world');



// print(factorial(4));


// var listt=new List<String>.filled(7, "Hello",growable: true);
// listt.add("Yooo");
// print(listt);

// listt.replaceRange(1, 4, ["first","second","third"]);
// print(listt);

// Map a1={"first":"kaustubh","Second":"Broly"};

// a1.forEach((k,v) {print("${k}:${v}"); });
// print(a1);
// a1["Second"]="Goku";
// a1["Third"]="Sengarp";
// print(a1);


// var details=new Map();

// details["a1"]=1;
// details["a2"]=2;
// details["a3"]=3;

// print(details);

// B b1=new B();
// b1.cal();

// B b1=new B();
// b1.data();


// C c1=new C();
// c1.age=18;
// c1.name="Yelo";
// c1.ageg();
// c1.nameg();
}

// int factorial(num1){
//   if(num1<=0){
//     return 1;
//   }
//   else{
//     return (num1 * factorial(num1-1));
//   }
// }


// class fact{


//   void calcfact(int numm){
//   int factt=1;
//     for(int i=1;i<=numm;i++){
//       factt=factt*i;
//     }

//     print("FActorial of ${numm} is ${factt}");
//   }
// }



// void numm(int s1,{s2,s3}){
//   print(s1);
//   print(s2);
//   print(s3);
// }

// int factorial(num1){
//   if(num1<=0){
//     return 1;
//   }
//   else{
// return (num1*factorial(num1-1));
//   }
// }


// class A{
// int a=10;
// }

// class B extends A{

//    int a=20;
// void cal(){
//     print("Value of a is ${a}");
//   print("Value of a is ${super.a}");
// }
// }

// class A{
// var age;
//   void ageg(){
//     print("Age:${age}");
//   }
// }

// class B{
//   var name;
//  void nameg(){
// print("Name is ${name}");
//  }
// }


// class C implements A,B{
// var age,name;

//  void ageg(){
//   print("The ages ${age}");
//  }

//  void nameg(){
//   print("Names is ${name}");
//  }
// }