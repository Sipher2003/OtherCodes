 void main() {
 
   int rev(int num){
   int reverse = 0,remainder;
     while(num>0){
       remainder=num%10;
       reverse=(reverse*10)+remainder;
       num~/=10;
     }
     
//      print("Reverse is ${reverse}");
     return (reverse);

   }
   
   print(rev(23));    
}