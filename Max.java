//6.Write a java program to enter two numbers and find maximum out of it.

import java.util.*;

class Max{
    public static void main(String[] args) {
    	Scanner mx = new Scanner(System.in);

    	System.out.print("Enter the first number:");
    	  int first = mx.nextInt();
    	System.out.print("Enter the Second number:");
    	  int second = mx.nextInt();
    	mx.close();

         int max;
    	System.out.print("Maximum number is:");
    	if(first > second)
    		max = first;
    	else if(first == second)
    		max = 0;
    	else
    		max = second;

    	System.out.println(max);
    }
}