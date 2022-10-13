//17.Write a java program to demonstrate the use of overloading a constructor.

class ConstOver{
	int id;
	String name;
	int age;

	ConstOver(int i,String n){
		this.id = i;
		this.name = n;
	}
	ConstOver(int i,String n,int a){
		this.id = i;
		this.name = n;
		this.age = a;
	}
	void display(){
		System.out.println(id+""+name+""+age);
	}
	public static void main(String[] args) {
		ConstOver one = new ConstOver(38,"Prince",21);
		ConstOver two = new ConstOver(42,"Osah",23);

		one.display();
		two.display();
		
	}
}