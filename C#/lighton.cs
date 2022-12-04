using System;

namespace Pattern
{
    class Program
    {
        public static void Main(string[] args)
    {
        //   bool positive;
        //   bool negative;
          
          Console.WriteLine("Enter True or False:");
          bool positive = bool.Parse(Console.ReadLine());
          bool negative = bool.Parse(Console.ReadLine());
          
          if (positive==true && negative==true){
              Console.WriteLine("On");
          }
          else if(positive==true && negative==false){
              Console.WriteLine("Off");
          }
          else if(positive==false && negative==true){
              Console.WriteLine("Off");
          }
          else{
              Console.WriteLine("Invalid");
          }
    }
    }
}