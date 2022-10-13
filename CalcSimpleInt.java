//Write a JAVA program to enter principle  amnt, rate of interest and nunber of years and find simple interest
import java.util.*;
class calcSimpleInt{
	 public static void main(String[] args) {
		Scanner simple = new Scanner(System.in);
		   System.out.print("Enter principle Amount:");
		        float prAnt = simple.nextFloat();
		   System.out.print("Enter Rate of interest:");
               float ratePer = simple.nextFloat();
               simple.nextLine();
           System.out.print("Enter number of years");
               int numyrs = simple.nextInt();
            simple.close();

            float SimpleInterest = (prAnt*ratePer*numyrs)/100;
            System.out.print("simple interest is:"+SimpleInterest);

	}
}