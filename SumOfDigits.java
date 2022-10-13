//10.Write a java program to enter a number and find out sum of digits.

import java.util.*;

class SumOfDigits{
	public static void main(String[] args) {
		Scanner sod = new Scanner(System.in);

        int number,digit,sum=0;
		System.out.print("Enter any number");
		number = sod.nextInt();
		while(number > 0){
			digit = number % 10;
			sum = sum + digit;
			number = number/10;
		}
		System.out.println("Sum of digis is:"+sum);
	}
}