package oops;

class Base{
	int x;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		System.out.println("I'm in base and setting X Now");
		this.x = x;
	}
	
	
	public void printMe() {
		System.out.println("This is a constructor");
	}
}

class Derived extends Base{
	
	int y;
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		System.out.println("I'm in base and setting y Now");
		this.y = y;
	}
	
}

public class cwh_45_inheritance {

	public static void main(String[] args) {
		
		//setting the value of base object
		Derived d = new Derived();
		d.setX(4);
		System.out.println(d.getX());
		d.setY(50);
		System.out.println(d.getY());
		
		//setting the value of base object
		Base b = new Base();
		b.setX(64);
		System.out.println(b.getX());
		

	}

}
