//26.Write a java program to demonstrate the use of final keyword with class and methods.

class FinalK{
	final void run(){
		System.out.println("Running...");
	}
}
class Subt extends FinalK{
	public static void main(String[] args) {
		new Subt().run();
	}
}