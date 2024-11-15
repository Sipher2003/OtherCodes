class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class productexception
{
   void productCheck(int weight) {
	 try
      	  {
		if(weight<100){
			throw new InvalidProductException("Product Invalid weight is out of range");
		}
		else
		{
			System.out.println("product is valid");
		}
	} catch(InvalidProductException ex)
      	  {
        	    System.out.println("Caught the exception");
         	   System.out.println(ex);
      	  }
   }
    public static void main(String args[])
    {
    	productexception obj = new productexception();
            obj.productCheck(200);
        }
}