//24.Write a java program to demonstrate the use of method overriding.

class Vehicle{
	void run(){
		System.out.println("Vehicle is running:");
	}
}
class Bike extends Vehicle{
	void run(){
		System.out.println("Bike is running safely");
	}
}
class TestInh{
public static void main(String[] args) {
	Bike obj = new Bike();
	obj.run();
	 }
}