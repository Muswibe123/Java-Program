//9.Write a java program to get the name from user and print 10 times using loop.
import java.util.*;
class NameU{
	public static void main(String[] args) {
		Scanner nm = new Scanner(System.in);

		System.out.print("Enter your name:");
		String name = nm.nextLine();

		for(int i = 0;i < 10;i++){
			System.out.println(name);
				}

	}
}