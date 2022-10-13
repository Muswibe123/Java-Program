//32.Write a java program to implement Arithmetic Exception.

class ArithmeticException
{
    public static void main(String args[])
    {
        try {
            int a = 30, b = 0;
            int c = a/b;  
            System.out.println ("Result = " + c);
        }catch(arithmeticexception e) {
            System.out.println (e);
        }
         System.out.println ("Can't divide a number by 0");
    }
}