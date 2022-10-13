//21. Write a java program to perform simple inheritance.

class SuperClass{
	int length;
	int breath;

	SuperClass(int x,int y){
		this.length = x;
		this.breath = y;
	}
	int area(){
		return (length * breath);
	}

}
class SubClass extends SuperClass{
	int height;

	SubClass(int x,int y,int z){
		super(x,y);
		this.height = z;
	}
	int volume(){
		return (length * breath * height);
	}
}
class TestInhe{
public static void main(String[] args) {
	SubClass one = new SubClass(14,12,10);
	int area1 = one.area();
	int volume1 = one.volume();

	System.out.println("Area1 ="+area1);
	System.out.println("volume1 ="+volume1);
      }
 }