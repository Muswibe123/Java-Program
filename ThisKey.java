//15.Write a java program to demonstrate the use of this keyword.

class Thiskey{
	int rollno;
	String name;
	float fee;

 Thiskey(int rollno,String name,float fee){
 	this.rollno = rollno;
 	this.name = name;
 	this.fee = fee;
 }
 void display(){
 	System.out.println(rollno+""+name+""+fee);
 }
 public static void main(String[] args) {
 	Thiskey one = new Thiskey(38,"Prince",2500f);
 	Thiskey two = new Thiskey(42,"Cyntia",2500f);
 	Thiskey three = new Thiskey(44,"Austin",2500f);
 	Thiskey four = new Thiskey(52,"Adam",2500f);
 	one.display();
 	two.display();
 	three.display();
 	four.display();
 }
}