//8.Write a Java program to enter 10 numbers and find sum and average of it.

import java.util.*;
  
 class TenNum{
 	public static void main(String[] args) {
 		Scanner num = new Scanner(System.in);

 		int i,n,sum=0;
 		float avg;

 		System.out.print("Input 10 numbers:");
 		for(i=1;i<=10;i++){
 		   n=num.nextInt();
 		   sum=sum+n;
 		}
 		avg=(float)(sum/10.0);
 		System.out.println("Sum of 10 numbers is:"+sum);
 		System.out.println("Average of 10 numbers is:"+avg);
 	}
 }