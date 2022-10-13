//12.Write a java program to demonstrate use of pass objects to methods.

class ObjectToMethod{
	static void add(int a,int b){
		System.out.println("The first value is:"+(a+b));
	}
	public void addition(int x,int y){
		System.out.println("The second value is:"+(x+y));
	}
    public static void main(String[] args) {
    		add(10,10);
           
           ObjectToMethod ad = new ObjectToMethod();
           ad.addition(5,5);

    	}	
}