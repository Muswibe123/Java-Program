//16.Write a java program to demonstsrate use of method overloading.

class MethodOverload{
	public void sum(int a,int b){
		System.out.println("Fisrt is:"+(a+b));
	}
	public void sum(int x,int y,int z){
		System.out.println("Fisrt is:"+(x+y+z));
	}
	public void sum(float c,float d){
		System.out.println("Fisrt is:"+(c+d));

	}
	public static void main(String[] args) {
		MethodOverload one = new MethodOverload();
		MethodOverload two = new MethodOverload();
		MethodOverload three = new MethodOverload();

		one.sum(10,10);
		two.sum(20,20,20);
		three.sum(2000f,3000f);
	}
}