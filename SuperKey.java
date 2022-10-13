//25.Write a java program to demonstrate the use of super keyword 

class SuperKey{
	String color = "white";
}
class Animal extends SuperKey{
	String color = "black";
 void printColor(){
 	System.out.println(color);
 	System.out.println(super.color);
 }
}
class Test{
	public static void main(String[] args) {
		Animal d = new Animal();
		d.printColor();
	}
}