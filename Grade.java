//5.Write a JAVA program to enter marks of 3 subject and find total, percentage, average, class and results.

import java.util.*;

class Grade{
	public static void main(String[] args) {
		Scanner mks = new Scanner(System.in);

		System.out.print("Enter marks of first subject:");
		   float sub1 = mks.nextFloat();
		System.out.print("Enter marks of second subjects:");
		   float sub2 = mks.nextFloat();
		System.out.print("Enter marks of third subject:");
		   float sub3 = mks.nextFloat();
		mks.close();

//calculating  total,average and percentage

		float total = sub1 + sub2 + sub3;
		float average = (float)(total/3.0);
		float percentage = (float)((total/300.0)*100);

//Calculating grades
         char grade;

		 if(average>=90)
		 	grade ='A';
		 else if(average>=80 && average < 90)
		 	grade ='B';
		 else if(average>=70 && average < 80)
		 	grade ='C';
		 else if(average>=60 && average <70)
		 	grade ='D';
		 else
		 	grade ='E';

// producing final output/ results

		 System.out.println("Total mark is :"+total);
		 System.out.println("Average mark is:"+average);
		 System.out.println("Percentage is:"+percentage);
		 System.out.println("Grade is:"+grade);
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   