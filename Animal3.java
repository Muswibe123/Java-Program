//27.Write a java program to demonstrate the use of abstract class and abstract method.

abstract class Animal3{
	public abstract void AnimalSound();
	}
class Pig extends Animal{
	public void AnimalSound(){
		System.out.println("The pig says:wee wee");
	}
}
class Main{
	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.AnimalSound();
	
	}
}