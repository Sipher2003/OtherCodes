using System;
namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter num1: ");
            int a = int.Parse(System.Console.ReadLine());
            Console.WriteLine("Enter num2: ");
            int b = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter num3: ");
            int c = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter num4: ");
            int d = int.Parse(Console.ReadLine());

            Console.WriteLine($"Product is {a * b * c * d}");

            Console.ReadKey();

        }
    }
}