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
            Console.WriteLine("Enter the character: ");
            string ch = Console.ReadLine();
            if(ch=="A" || ch=="a" || ch == "E" || ch == "e" || ch == "I" || ch == "i" || ch == "O" || ch == "o" || ch == "U" || ch == "u")
            {
                Console.WriteLine("Its a vowel");
            }
            else
            {
                Console.WriteLine("Consonant");
            }
            Console.ReadKey();
            }
        }
        
    }