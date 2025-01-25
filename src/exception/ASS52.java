package exception;

public class ASS52 {

    public static void main(String arg[])
    {	int a=5,b=0;
        int c[]={1,2,3};
        String s="SHILPI";
        try{
            try{
                try{
                    System.out.println("a= "+a/b);
                }
                catch(ArithmeticException e)
                {
                    System.out.println("Exception: "+e+ " INVALID DIVISION");

                }
                System.out.println(c[5]);
            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Exception: "+e+ " CROSSED ARRAY SIZE");
            }
            System.out.println(s.charAt(8));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception: "+e+ " CROSSED STRING SIZE");
        }
        System.out.println("QUIT");
    }
}


