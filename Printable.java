//28.Write a java program to demonstrate use of interface.

interface Printable{
	void print();
}
class A6 implements Printable{
	public void print(){
	    System.out.println("Hie Everyone");
	}
}
public static void main(String[] args) {
	A6 obj = new A6();
	obj.print();
}