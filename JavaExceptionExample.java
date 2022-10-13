//31.Write a java program to implement simple exception in Java

   class JavaExceptionExample{  
      public static void main(String args[]){  
       try{    
          int data=100/0;  
       }catch(ArithmeticException e){System.out.println(e);}  
       System.out.println("rest of the code...");  
      }  
    }  