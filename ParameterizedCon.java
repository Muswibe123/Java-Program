//14.Write a java program to demonstrate the use of parameterized constructor.

class ParameterizedCon{
	ParameterizedCon(String name){
		System.out.println("Constructor with one"+"argument-String"+name);
	}
	ParameterizedCon(String name,int age){
		System.out.println("Constructor with two arguments:"+"String and Integer:"+name+""+age);
	}
	ParameterizedCon(long id){
		System.out.println("Constructor with one argument but with diff type:"+"long:"+id);
	}
	public static void main(String[] args) {
		ParameterizedCon builder = new ParameterizedCon("Austin");
		ParameterizedCon builder1 = new ParameterizedCon("Osamah",44);
		ParameterizedCon builder2 = new ParameterizedCon(0719301834);
	}
}