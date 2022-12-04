// 1
// 2 3
// 4 5 6
// 7 8 9 10

using System;

namespace Pattern
{
    class Program
    {
        public static void Main(string[] args)
    {
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
    }
    }
}