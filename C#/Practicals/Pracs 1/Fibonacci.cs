using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i,n1=0 ,n2 = 1, n3;
            Console.WriteLine("Enter the number of elements: ");
            int number = int.Parse(Console.ReadLine());
            Console.WriteLine($"\n{n1}\n{n2}");
            for (i = 2; i < number; i++)
            {
                n3 = n1 + n2;
                Console.WriteLine($"{n3} ");
                n1 = n2;
                n2 = n3;
            }
            Console.ReadKey();
        }
    }
}
