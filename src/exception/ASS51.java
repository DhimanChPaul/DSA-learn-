package exception;

public class ASS51 {
   // Write a program where four types of exception ie. Arithmetic exception, ArrayIndexOutOfBounds, StringIndexOutBounds,
   // NullPointerException using different catch block to handle that exception and ensure that program not terminated using
   // final block concept.
    	public static void main(String []args)
    {	int a=5,b=0;
        int c[]={1,2,3};
        String s="SHILPI";
        int d[]=null;
        // this try for the final key word
        try{
            for(int i=0;i<4;i++)
            {	try{
                switch(i)
                {	case 0:
                    System.out.println("a= "+a/b);
                    break;
                    case 1:
                        System.out.println(c[5]);
                        break;
                    case 2:
                        System.out.println(s.charAt(8));
                        break;
                    case 3:
                        System.out.println(d[4]);
                        break;
                }
            }
            catch(ArithmeticException e)
            {	System.out.println("Exception: "+e+ " INVALID DIVISION");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {	System.out.println("Exception: "+e+ " CROSSED ARRAY SIZE");
            }
            catch(StringIndexOutOfBoundsException e)
            {	System.out.println("Exception: "+e+ " CROSSED STRING SIZE");
            }
            catch(NullPointerException e)
            {
                System.out.println("Exception: "+e+ " INVALID USE OF NULL REFERENCE");
            }
            }
        }
        finally
        {	System.out.println("Program executing again");
        }





        System.out.println("QUIT");
    }


}
