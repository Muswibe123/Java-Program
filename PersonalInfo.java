//4.Write a java program to get personal information from the user and display on the screen.
import java.util.*;
class PersonalInfo{
	public static void main(String[] args) {
		Scanner pers = new Scanner(System.in);

		System.out.print("Enter your name:");
		   String name = pers.nextLine();											
		System.out.print("Enter your Age:");
		   int age = pers.nextInt();
		   pers.nextLine();
		System.out.print("Enter your Adress:");
		   long addr = pers.nextLong();
		pers.close();

		System.out.println("Your name is:"+name);
		System.out.println("Your Age is:"+age);
		System.out.println("YOur Address is:"+addr);
	}
}