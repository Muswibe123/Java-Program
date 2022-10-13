//19.Write a java program to demonstrate the use of nested classes.

class OuterClass{
	static int outer_x = 10;
	int outer_y = 20;

	private static int outer_private = 30;
  
  static class StaticNestedClass{
  	void display(){
  		System.out.println("outer_x ="+outer_x);
  		System.out.println("outer_private ="+outer_private);
  	}
  }
  public static void main(String[] args) {
  	OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
  	nestedObject.display();
  }
}