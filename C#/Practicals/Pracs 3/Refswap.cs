//Ref keyword

using System;

namespace practical2
{
    class Program
    {
        int num;
        float numm;

        
        void swap(ref int num1, ref int num2)
        {
            Console.WriteLine($"Nos before swapping:{num1} {num2}");
            num = num1;
            num1 = num2;
            num2 = num;
            Console.WriteLine($"Nos after swapping:{num1} {num2}");
        }

        void swap(ref float num1, ref float num2)
        {
            Console.WriteLine($"Nos before swapping:{num1} {num2}");
            numm = num1;
            num1 = num2;
            num2 = numm;
            Console.WriteLine($"Nos after swapping:{num1} {num2}");
        }





        static void Main(string[] args)
        {
            int a = 3;
            int b = 4;
            float c = 5.5f;
            float d = 7.7f;
            Program p = new Program();
            p.swap(ref a,ref b);
            p.swap(ref d, ref c);


        }

        
    }
}