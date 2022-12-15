using System;

namespace ConsoleApp2
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Pattern 1");

            int i, j, rows, k = 1;

            Console.Write("\n\n");
            Console.Write("Display the pattern like right angle triangle with number increased by 1:\n");
            Console.Write("---------------------------------------------------------------------------");
            Console.Write("\n\n");

            Console.Write("Input number of rows : ");
            rows = Convert.ToInt32(Console.ReadLine());
            for (i = 1; i <= rows; i++)
            {
                for (j = 1; j <= i; j++)
                    Console.Write("{0} ", k++);
                Console.Write("\n");

            }


            Console.WriteLine("Pattern 2");

            int o, v, n, p, q;

            Console.Write("\n\n");
            Console.Write("Print the Floyd's Triangle:\n");
            Console.Write("-----------------------------");
            Console.Write("\n\n");

            Console.Write("Input number of rows : ");
            n = Convert.ToInt32(Console.ReadLine());
            for (o = 1; o <= n; o++)
            {
                if (o % 2 == 0)
                { p = 1; q = 0; }
                else
                { p = 0; q = 1; }
                for (v = 1; v <= i; v++)
                    if (v % 2 == 0)
                        Console.Write("{0}", p);
                    else
                        Console.Write("{0}", q);
                Console.Write("\n");
            }


            Console.WriteLine("pattern 3");

            int z, x, n1;

            Console.Write("\n\n");
            Console.Write("Display the pattern like pyramid containing odd number of asterisks:\n");
            Console.Write("----------------------------------------------------------------------");
            Console.Write("\n\n");

            Console.Write("Input number of rows for this pattern :");
            n1 = Convert.ToInt32(Console.ReadLine());
            for (z = 0; z < n1; z++)
            {
                for (x = 1; x <= n1 - z; x++)
                    Console.Write(" ");
                for (x = 1; x <= 2 * z - 1; x++)
                    Console.Write("*");
                Console.Write("\n");
            }
        }
    }
}