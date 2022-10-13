//23.Write a program to demonstrate hierarchial inheritance

class Animal2{
	void eat(){
		System.out.println("eating..");
	}
}
class Cat extends Animal{
	void meow(){
		System.out.println("meowing..");
	}
}
class Dog extends Animal{
	void bark(){
		System.out.println("barking..");
	}
}
class TestInheritance{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}