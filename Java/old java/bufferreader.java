import java.io.*;
class bufferreader
{
	public static void main(String ar[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		int a=Integer.parseInt(br.readLine());
			
		System.out.println("second number");
		int b=Integer.parseInt(br.readLine());

		System.out.println("values before swappin are "+a+" "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("values after swappin are "+a+" "+b);
	}
}