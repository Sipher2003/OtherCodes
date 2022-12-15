using System;

namespace ConsoleApp2
{
    class Program
    {
        static void Main(string[] args)
        {
            
            string y = "n";int num;
            do
            {
                Console.WriteLine("Enter the operation: ");
                int a = int.Parse(Console.ReadLine());
                switch (a)
                {
                    case 1:
                Console.WriteLine("Enter the number: ");
                 num = int.Parse(Console.ReadLine());
                        int i, fact = 1;
                        for (i = 1; i <= num; i++)
                        {
                            fact = fact * i;
                        }
                        Console.WriteLine($"Factorial is {fact}");
                        break;

                    case 2:
                        Console.WriteLine("Enter the number: ");
                        num = int.Parse(Console.ReadLine());
                        Console.WriteLine($"Conversion of Rs{num} to $ is{num * 82}");
                        break;

                    case 3:
                        Console.WriteLine("Enter the x1: ");
                        int x1 = int.Parse(Console.ReadLine());
                        Console.WriteLine("Enter the x2: ");
                        int x2 = int.Parse(Console.ReadLine());
                        Console.WriteLine("Enter the y1: ");
                        int y1 = int.Parse(Console.ReadLine());
                        Console.WriteLine("Enter the y2: ");
                        int y2 = int.Parse(Console.ReadLine());
                        double distance = Math.Sqrt((Math.Pow(x1 - x2, 2) + Math.Pow(y1 - y2, 2)));
                        Console.WriteLine($"Distance is {distance}");
                        break;

                    case 4:
                        Console.WriteLine("Enter the number: ");
                        num = int.Parse(Console.ReadLine());
                        Console.WriteLine($"{num} Celcius to Farenhite is {(num * 1.8) + 32}");
                        break;

                    default:
                        Console.WriteLine("over");
                        break;


                }
                Console.WriteLine("Continue?: ");
                 y= Console.ReadLine();
            } while (y == "Y" || y == "y");



        }
    }
}