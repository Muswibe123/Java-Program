//13.Write a java program to demonstrate use of constructors.

class Constractor1{

	String name;
	int id;

	Constractor1(String name,int id){
		this.name = name;
		this.id = id;
	}
public static void main(String[] args) {
	   Constractor1 builder = new Constractor1("Austin",44);
	   System.out.println("My name is:"+builder.name +"id number:"+builder.id);
}
}
