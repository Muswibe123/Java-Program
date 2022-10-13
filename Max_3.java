//7.Write a java program to enter three numbers and find maximum out of it.

import java.util.*;

class Max_3{
	public static void main(String[] args) {
		Scanner mx3 = new Scanner(System.in);

		System.out.println("Enter three numbers:");
		  int one = mx3.nextInt();
		  int two = mx3.nextInt();
		  int three = mx3.nextInt();
		mx3.close();

        int max;
		System.out.print("Maximum number is:");

		if(one > two && one > three)
			max = one;
		else if(two > one && two > three)
			max = two;
		else if(three > one && three > two)
			max = three;
		else
			max = 0;

		System.out.println(max);

	}
}