using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        class student
        {
            string name, course;
            int id, marks;
            void gett()
            {
                Console.WriteLine("Enter Student name: ");
                name = Console.ReadLine();
                Console.WriteLine("Enter student id: ");
                id = int.Parse(Console.ReadLine());
                Console.WriteLine("Enter Course name: ");
                course = Console.ReadLine();
                Console.WriteLine("Enter total marks:");
                marks = int.Parse(Console.ReadLine());
            }

            void Display()
            {
                Console.WriteLine($"Name is {name}");
                Console.WriteLine($"Id is {id}");
                Console.WriteLine($"Course is {course}");
                Console.WriteLine($"Marks are {marks}");
            }
            static void Main(string[] args)
            {
                student s1 = new student();
                s1.gett();
                s1.Display();

                Console.ReadKey();
            }
        }
         
    }
}
