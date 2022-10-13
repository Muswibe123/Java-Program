//11.Write a java  program to demonstrate use of class and methods.

class ClassMethod{
	static void myMethod(){
		System.out.println("This is my first class method");
	}
	public void mySecMethod(){
		System.out.println("This my second class method");
	}
	public static void main(String[] args) {
		myMethod();  //calling the static method.

        //mySecMethod();, This would compile an error.

		ClassMethod obj = new ClassMethod(); // creating object of classMehod 
		obj.mySecMethod(); // calling the public method on the object.
		
	}
}