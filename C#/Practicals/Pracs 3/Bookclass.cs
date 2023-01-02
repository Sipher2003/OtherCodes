//Class books
using System;

namespace practical2
{
    class Program
    {
        
            int price;
            int pageno;
            String bookname;
            String authname;

            void getdata()
            {
                Console.WriteLine("Price:");
                price = int.Parse(Console.ReadLine());
                Console.WriteLine("Pages:");
                pageno = int.Parse(Console.ReadLine());
                Console.WriteLine("Bookname:");
                bookname = (Console.ReadLine());
                Console.WriteLine("Author:");
                authname = (Console.ReadLine());
            }


            void showdata()
            {
                Console.WriteLine($"Price is {price}");
                Console.WriteLine($"Pages are {pageno}");
                Console.WriteLine($"Bookname is  {bookname}");
                Console.WriteLine($"Author is {authname}");
            }
        
        
        static void Main(string[] args)
        {


            Program[] b = new Program[5];
            //b.getdata();
            //b.showdata();
            for(int i = 0; i <= 4; i++)
            {
                b[i] = new Program();
                b[i].getdata();
            }

            for(int j = 1; j <= 5; j++) 
            {
                b[j].showdata();
            }

        }

        
    }
}