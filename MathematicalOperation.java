//Write a JAVA program to enter two nos. and perform all 5 mathematical operations

import java.util.*;
 class MathematicalOoperation{
   public static void main(String[] args) {
		Scanner optn = new Scanner(System.in);
		   System.out.println("Enter first number:");
		     int x = optn.nextInt();
		   System.out.println("Enter Second number:");
		     int y = optn.nextInt();
		   optn.close();

		   System.out.println("Addition is:"+(x+y));
		   System.out.println("Subtraction is:"+(x-y));
		   System.out.println("Multiplication is:"+(x*y));
		   System.out.println("Modullus is:"+(x%y));
		   System.out.println("Division is:"+(x/y));
		
	}
}